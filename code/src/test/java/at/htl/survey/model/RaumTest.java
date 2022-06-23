package at.htl.survey.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class RaumTest {

    @Test
    void userStory() {
        String sysadmin = "Systemadministrator";

        Raum raum = new Raum("1", "0");
        raum.setWas("korrekte Raumnummern");
        raum.setWarum("eine sortierte Uebersicht nach Nummern und Stockwerken");

        assertThat(raum.getRaumNr()).isEqualTo("1");
        assertThat(raum.getWas()).isEqualTo("korrekte Raumnummern");
        assertThat(raum.getWarum()).isEqualTo("eine sortierte Uebersicht nach Nummern und Stockwerken");

        System.out.println("Als " + sysadmin + " will ich " + raum.getWas() + ", fuer " + raum.getWarum());
    }

    @Test
    void createRaum() {
        // arrange
        Raum raum252 = new Raum("252", "2");

        // act
        raum252.setDescr("home of 3bhitm");

        //assert
        assertThat(raum252.getStockwerk()).isEqualTo("2");
        assertThat(raum252.getRaumNr()).isEqualTo("252");
        assertThat(raum252.getDescr()).isEqualTo("home of 3bhitm");


        Raum raum74E = new Raum("74E", "0");

        raum74E.setDescr("home of Herr Professor Baar");

        assertThat(raum74E.getStockwerk()).isEqualTo("0");
        assertThat(raum74E.getRaumNr()).isEqualTo("74E");
        assertThat(raum74E.getDescr()).isEqualTo("home of Herr Professor Baar");


        Raum edv10 = new Raum("135", "1");

        edv10.setDescr("immer belegt");

        assertThat(edv10.getStockwerk()).isEqualTo("1");
        assertThat(edv10.getRaumNr()).isEqualTo("135");
        assertThat(edv10.getDescr()).isEqualTo("immer belegt");

    }
}