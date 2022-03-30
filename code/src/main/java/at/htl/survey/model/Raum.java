package at.htl.survey.model;

public class Raum {

    private final String raumNr;
    private final int stockwerk;
    private String descr;

    public Raum(String raumNr, int stockwerk) {
        this.raumNr = raumNr;
        this.stockwerk = stockwerk;
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

