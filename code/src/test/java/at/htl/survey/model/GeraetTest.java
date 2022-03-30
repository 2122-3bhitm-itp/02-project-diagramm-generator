package at.htl.survey.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class GeraetTest {

    Raum raum252 = new Raum(252, 2);
    Geraet geraet = new Geraet();
    Kategorie bildschirm = new Kategorie("Bildschirme");
    Firma hp = new Firma("HP");

    @Test
    void createGeraet() {
        Geraet klassenBildschirm = new Geraet(1234, raum252, geraet, bildschirm, hp, false, true);

        assertThat(klassenBildschirm.getGeraeteNr()).isEqualTo(1234);
        assertThat(klassenBildschirm.getRaum()).isEqualTo(raum252);
        assertThat(klassenBildschirm.getGeraet()).isEqualTo(geraet);
        assertThat(klassenBildschirm.getKategorie()).isEqualTo(bildschirm);
        assertThat(klassenBildschirm.getFirma()).isEqualTo(hp);
        assertThat(klassenBildschirm.isKabellos()).isEqualTo(false);
        assertThat(klassenBildschirm.isAustauschbar()).isEqualTo(true);
    }

}