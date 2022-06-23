package at.htl.survey.database;

import at.htl.survey.model.Firma;
import at.htl.survey.model.Geraet;
import at.htl.survey.model.Kategorie;
import at.htl.survey.model.Raum;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class GeraetRepository {

    public GeraetRepository() {
    }

    public List<Geraet> getGeraete() {
        List<Geraet> geraete = new LinkedList<Geraet>();
        try (Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/db;create=true", "app", "app")) {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM GERAET join FIRMA using (firmennr) join Kategorie using (KATEGORIENR) join raum using (raumnr)");

            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet != null && resultSet.next()) {
                Kategorie category = new Kategorie(resultSet.getInt("KATEGORIENR"),resultSet.getString("KATEGORIENAME"));
                Raum raum = new Raum(resultSet.getString("RAUMNR"), resultSet.getString("STOCKWERK"));
                Firma firma = new Firma(resultSet.getInt("FIRMENNR"),resultSet.getString("Name"));

                Geraet geraet=  new Geraet(resultSet.getInt("GERAETNR"), raum, null, category, firma, true, true, resultSet.getInt("GERAETNR"));
                geraete.add(geraet);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return geraete;
    }

    public Geraet getGeraet(int id) {
        Geraet geraet = null;
        try (Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/db;create=true", "app", "app")) {
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM GERAET join FIRMA using (firmennr) join Kategorie using (KATEGORIENR) join raum using (raumnr) where GERAETNR = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet != null && resultSet.next()) {
                Kategorie category = new Kategorie(resultSet.getInt("KATEGORIENR"),resultSet.getString("KATEGORIENAME"));
                Raum raum = new Raum(resultSet.getString("RAUMNR"), resultSet.getString("STOCKWERK"));
                Firma firma = new Firma(resultSet.getInt("FIRMENNR"),resultSet.getString("Name"));

                geraet=  new Geraet(resultSet.getInt("GERAETNR"), raum, null, category, firma, true, true, resultSet.getInt("GERAETNR"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
return geraet;

    }

    public boolean updateGeraet(Geraet geraet) {
        try (Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/db;create=true", "app", "app")) {
            PreparedStatement preparedStatement = connection.prepareStatement("UPDATE GERAET SET AUSTAUSCHBAR = ?,KABELLOS = ?,FIRMENNR = ?,RAUMNR= ?,KATEGORIENR= ?,PARTOF= ? where GERAETNR= ?");
            preparedStatement.setBoolean(1, geraet.isAustauschbar());
            preparedStatement.setBoolean(2, geraet.isKabellos());
            preparedStatement.setInt(3, geraet.getFirma().getFirmenNr());
            preparedStatement.setString(4, geraet.getRaum().getRaumNr());
            preparedStatement.setInt(5, geraet.getKategorie().getCategoryId());
            preparedStatement.setInt(6, geraet.getPartof());
            preparedStatement.setInt(7, geraet.getGeraeteNr());

            return preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean insertGeraet(Geraet geraet) {
        try (Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/db;create=true", "app", "app")) {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO GERAET VALUES (?,?,?,?,?,?,?)");
            preparedStatement.setInt(1,geraet.getGeraeteNr());
            preparedStatement.setBoolean(2,geraet.isAustauschbar());
            preparedStatement.setBoolean(3,geraet.isKabellos());
            preparedStatement.setInt(4,geraet.getFirma().getFirmenNr());
            preparedStatement.setInt(5,geraet.getKategorie().getCategoryId());
            preparedStatement.setString(6,geraet.getRaum().getRaumNr());
            preparedStatement.setInt(7,geraet.getPartof());

            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return false;
    }

    public boolean deleteGeraet(int id) {
        try (Connection connection = DriverManager.getConnection("jdbc:derby://localhost:1527/db;create=true", "app", "app")) {
            PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM Geraet where GERAETNR = ?");
            preparedStatement.setInt(1, id);
            return preparedStatement.execute();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
