package at.htl.survey.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class FirmaTest {

    @Test
    void userStory() {
        Firma hp = new Firma("HP");
        hp.setWas("Bewertungen zu verkauften Produkten");
        hp.setWarum("Verbesserung von Produkten mit schlechter Bewertung");

        assertThat(hp.getName()).isEqualTo("HP");
        assertThat(hp.getWas()).isEqualTo("Bewertungen zu verkauften Produkten");
        assertThat(hp.getWarum()).isEqualTo("Verbesserung von Produkten mit schlechter Bewertung");

        System.out.println("Als " + hp.getName() + " wollen wir " + hp.getWas() + ", fuer " + hp.getWarum());
    }

    @Test
    void createFirma() {
        Firma hp = new Firma("test");

        hp.setName("HP");

        assertThat(hp.getName()).isEqualTo("HP");


        Firma iiyama = new Firma("dfg");

        iiyama.setName("iiyama");

        assertThat(iiyama.getName()).isEqualTo("iiyama");


        Firma apple = new Firma("orange");

        apple.setName("Apple");

        assertThat(apple.getName()).isEqualTo("Apple");
    }



}