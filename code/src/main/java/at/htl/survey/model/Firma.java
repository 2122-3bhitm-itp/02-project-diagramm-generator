package at.htl.survey.model;

public class Firma {
    private int firmenNr;
    private String name;


    public Firma(int firmenNr, String name) {
        this.firmenNr = firmenNr;
        this.name = name;
    }

    public int getFirmenNr() {
        return firmenNr;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
