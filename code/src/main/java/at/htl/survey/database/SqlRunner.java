package at.htl.survey.database;

import at.htl.survey.controller.Database;
import at.htl.survey.model.Firma;
import at.htl.survey.model.Geraet;
import at.htl.survey.model.Kategorie;
import at.htl.survey.model.Raum;
import org.apache.ibatis.jdbc.ScriptRunner;


import javax.sql.DataSource;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class SqlRunner {

    private static final String SCRIPT_PROPERTIES_PATH = "sql/script-files.properties";

    public static void main(String[] args) {
        Raum raum252 = new Raum("1", "2");
        List<Geraet> geraet = new ArrayList<>();
        Kategorie bildschirm = new Kategorie(1,"Bildschirme");
        Firma iiyama = new Firma(1,"iiyama");
        Geraet probe = new Geraet(3, raum252, geraet, bildschirm, iiyama, false, false, 1);

        dropAndCreateTables();
         runScript(SqlScript.INSERT);
        GeraetRepository geraetRepository = new GeraetRepository();
        System.out.println(geraetRepository.getGeraet(1));
        System.out.println(geraetRepository.getGeraete());
        geraetRepository.insertGeraet(probe);
        probe.setAustauschbar(true);
        probe.setPartof(1);
        geraetRepository.updateGeraet(probe);
        geraetRepository.deleteGeraet(2);
    }

    public static void dropAndCreateTables() {
        Properties scriptProperties = new Properties();
        try {
            scriptProperties.load(new FileInputStream(SCRIPT_PROPERTIES_PATH));

            DataSource dataSource = Database.getDataSource();
            Connection conn = dataSource.getConnection();
            ScriptRunner sr = new ScriptRunner(conn);

            sr.setLogWriter(null);

            String dropScript = scriptProperties.getProperty(SqlScript.DROP.name().toLowerCase());
            sr.runScript(new BufferedReader(new FileReader(dropScript)));
            System.out.println("Tables deleted");
            String createScript = scriptProperties.getProperty(SqlScript.CREATE.name().toLowerCase());
            sr.runScript(new BufferedReader(new FileReader(createScript)));
            System.out.println("Tables created");
        } catch (IOException | SQLException e) {

            e.printStackTrace();
        }
    }

    public static void runScript(SqlScript sqlScript) {

        try {
            Properties scriptProperties = new Properties();
            scriptProperties.load(new FileInputStream(SCRIPT_PROPERTIES_PATH));

            DataSource dataSource = Database.getDataSource();
            Connection conn = dataSource.getConnection();
            System.out.println("Connection established for " + sqlScript.name() + "......");
            ScriptRunner sr = new ScriptRunner(conn);
            //sr.setLogWriter(null);

            String script = scriptProperties.getProperty(sqlScript.name().toLowerCase());
            sr.runScript(new BufferedReader(new FileReader(script)));

        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }
}
