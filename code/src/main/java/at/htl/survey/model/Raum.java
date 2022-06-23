package at.htl.survey.model;

public class Raum {

    private final String raumNr;
    private final String stockwerk;
    private String descr;
    private String was;
    private String warum;

    public Raum(String raumNr, String stockwerk) {
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

    public String getStockwerk() {
        return stockwerk;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Override
    public String toString() {
        return "Raum{" +
                "raumNr='" + raumNr + '\'' +
                ", stockwerk='" + stockwerk + '\'' +
                ", descr='" + descr + '\'' +
                ", was='" + was + '\'' +
                ", warum='" + warum + '\'' +
                '}';
    }
}

