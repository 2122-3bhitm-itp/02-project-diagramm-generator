package at.htl.survey.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class RaumTest {

    @Test
    void createRaum() {
        // arrange
        Raum raum252 = new Raum(252, 2);

        // act
        raum252.setDescr("home of 3bhitm");

        //assert
        assertThat(raum252.getStockwerk()).isEqualTo(2);
        assertThat(raum252.getRaumNr()).isEqualTo(252);
        assertThat(raum252.getDescr()).isEqualTo("home of 3bhitm");


    }
}