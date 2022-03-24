package at.htl.survey.model;

public class Geraet {

    private int geraeteNr;
    private Raum raum;
    private Geraet geraet;
    private Kategorie kategorie;
    private Firma firma;
    private boolean kabellos;
    private boolean austauschbar;

    public Geraet() {
    }

    public Geraet(int geraeteNr, Raum raum, Geraet geraet, Kategorie kategorie, Firma firma, boolean kabellos, boolean austauschbar) {
        this.geraeteNr = geraeteNr;
        this.raum = raum;
        this.geraet = geraet;
        this.kategorie = kategorie;
        this.firma = firma;
        this.kabellos = kabellos;
        this.austauschbar = austauschbar;
    }

    public int getGeraeteNr() {
        return geraeteNr;
    }


    public Raum getRaum() {
        return raum;
    }

    public void setRaum(Raum raum) {
        this.raum = raum;
    }

    public Geraet getGeraet() {
        return geraet;
    }

    public void setGeraet(Geraet geraet) {
        this.geraet = geraet;
    }

    public Kategorie getKategorie() {
        return kategorie;
    }

    public void setKategorie(Kategorie kategorie) {
        this.kategorie = kategorie;
    }

    public Firma getFirma() {
        return firma;
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
    }

    public boolean isKabellos() {
        return kabellos;
    }

    public void setKabellos(boolean kabellos) {
        this.kabellos = kabellos;
    }

    public boolean isAustauschbar() {
        return austauschbar;
    }

    public void setAustauschbar(boolean austauschbar) {
        this.austauschbar = austauschbar;
    }
}
