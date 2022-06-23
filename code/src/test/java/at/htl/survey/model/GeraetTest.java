package at.htl.survey.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import at.htl.survey.model.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class GeraetTest {


    Raum raum252 = new Raum("252", "2");
    List<Geraet> geraet = new ArrayList<>();
    Kategorie bildschirm = new Kategorie(1,"Bildschirme");
    Firma iiyama = new Firma(1,"iiyama");

    @Test
    void userStory() {
        String sysadmin = "Systemadministrator";

        Geraet klassenBildschirm = new Geraet(1234, raum252, geraet, bildschirm, iiyama, false, true, 1234);
        klassenBildschirm.setWas("alle Detailinformationen von jedem Geraet");
        klassenBildschirm.setWarum("die Identifikation und Zuordnung des jeweiligen Geraets");

        assertThat(klassenBildschirm.getGeraeteNr()).isEqualTo(1234);
        assertThat(klassenBildschirm.getWas()).isEqualTo("alle Detailinformationen von jedem Geraet");
        assertThat(klassenBildschirm.getWarum()).isEqualTo("die Identifikation und Zuordnung des jeweiligen Geraets");

        System.out.println("Als " + sysadmin + " will ich " + klassenBildschirm.getWas() + ", fuer " + klassenBildschirm.getWarum());
    }




    @Test
    void createGeraet() {
        Geraet klassenBildschirm = new Geraet(1234, raum252, geraet, bildschirm, iiyama, false, true, 1234);

        assertThat(klassenBildschirm.getGeraeteNr()).isEqualTo(1234);
        assertThat(klassenBildschirm.getRaum()).isEqualTo(raum252);
        assertThat(klassenBildschirm.getGeraet()).isEqualTo(geraet);
        assertThat(klassenBildschirm.getKategorie()).isEqualTo(bildschirm);
        assertThat(klassenBildschirm.getFirma()).isEqualTo(iiyama);
        assertThat(klassenBildschirm.isKabellos()).isEqualTo(false);
        assertThat(klassenBildschirm.isAustauschbar()).isEqualTo(true);
    }

}