package at.htl.survey.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class KategorieTest {

    @Test
    void userStory() {
        String sysadmin = "Systemadministrator";

        Kategorie computer = new Kategorie(1, "computer");
        computer.setWas("valide Kategorienamen");
        computer.setWarum("die Kategorisierung der Geraete");

        assertThat(computer.getCategoryName()).isEqualTo("computer");
        assertThat(computer.getWas()).isEqualTo("valide Kategorienamen");
        assertThat(computer.getWarum()).isEqualTo("die Kategorisierung der Geraete");

        System.out.println("Als " + sysadmin + " will ich " + computer.getWas() + ", fuer " + computer.getWarum());
    }

    @Test
    void createKategorie() {
        Kategorie bildschirm = new Kategorie(1, "test");

        bildschirm.setCategoryName("Bildschirme");

        assertThat(bildschirm.getCategoryName()).isEqualTo("Bildschirme");


        Kategorie computer = new Kategorie(1, "asdf");

        computer.setCategoryName("Computer");

        assertThat(computer.getCategoryName()).isEqualTo("Computer");


        Kategorie kabel = new Kategorie(1, "qwertzu");

        kabel.setCategoryName("Kabel");

        assertThat(kabel.getCategoryName()).isEqualTo("Kabel");
    }
}