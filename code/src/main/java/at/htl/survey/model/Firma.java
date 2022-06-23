package at.htl.survey.model;

public class Firma {
    private String name;
    private int firmenNr;
    private String was;
    private String warum;
    public Firma(int firmenr,String name) {
        this.firmenNr =firmenr;
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

    @Override
    public String toString() {
        return "Firma{" +
                "name='" + name + '\'' +
                ", was='" + was + '\'' +
                ", warum='" + warum + '\'' +
                '}';
    }
}
