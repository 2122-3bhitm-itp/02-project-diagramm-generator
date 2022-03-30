package at.htl.survey.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class KategorieTest {

    @Test
    void createKategorie() {
        Kategorie kabellos = new Kategorie(0, "test");

        kabellos.setCategoryName("Kabellos");

        assertThat(kabellos.getCategoryName()).isEqualTo("Kabellos");
        assertThat(kabellos.getCategoryId()).isEqualTo(0);
    }
}