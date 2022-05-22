package at.htl.survey.model;

public class Firma {
    private static int firmenNr = 0;
    private String name;
    private String was;
    private String warum;
    public Firma(String name) {
        this.firmenNr = ++firmenNr;
        this.name = name;
    }

    public String getWas() {
        return was;
    }

    public void setWas(String was) {
        this.was = was;
    }

    public String getWarum() {
        return warum;
    }

    public void setWarum(String warum) {
        this.warum = warum;
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
