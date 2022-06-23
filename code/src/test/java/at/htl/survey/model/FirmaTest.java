package at.htl.survey.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class FirmaTest {

    @Test
    void userStory() {
        Firma hp = new Firma(1,"HP");
        hp.setWas("Bewertungen zu verkauften Produkten");
        hp.setWarum("Verbesserung von Produkten mit schlechter Bewertung");

        assertThat(hp.getName()).isEqualTo("HP");
        assertThat(hp.getWas()).isEqualTo("Bewertungen zu verkauften Produkten");
        assertThat(hp.getWarum()).isEqualTo("Verbesserung von Produkten mit schlechter Bewertung");

        System.out.println("Als " + hp.getName() + " wollen wir " + hp.getWas() + ", fuer " + hp.getWarum());
    }

    @Test
    void createFirma() {
        Firma hp = new Firma( 1,"test");

        hp.setName("HP");

        assertThat(hp.getName()).isEqualTo("HP");


        Firma iiyama = new Firma(1,"dfg");

        iiyama.setName("iiyama");

        assertThat(iiyama.getName()).isEqualTo("iiyama");


        Firma apple = new Firma(1,"orange");

        apple.setName("Apple");

        assertThat(apple.getName()).isEqualTo("Apple");
    }



}