package at.htl.survey.model;

public class Raum {

    private final String raumNr;
    private final int stockwerk;
    private String descr;
    private String was;
    private String warum;

    public Raum(String raumNr, int stockwerk) {
        this.raumNr = raumNr;
        this.stockwerk = stockwerk;
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

    public String getRaumNr() {
        return raumNr;
    }

    public int getStockwerk() {
        return stockwerk;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }
}

