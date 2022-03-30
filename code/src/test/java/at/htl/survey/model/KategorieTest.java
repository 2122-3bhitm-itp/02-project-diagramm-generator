package at.htl.survey.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class KategorieTest {

    @Test
    void createKategorie() {
        Kategorie bildschirm = new Kategorie("test");

        bildschirm.setCategoryName("Bildschirme");

        assertThat(bildschirm.getCategoryName()).isEqualTo("Bildschirme");
    }
}