package at.htl.survey.model;

public class Raum {

    private int raumNr;
    private int stockwerk;

    public Raum(int raumNr, int stockwerk) {
        this.raumNr = raumNr;
        this.stockwerk = stockwerk;
    }


    public void setStockwerk(int stockwerk) {
        this.stockwerk = stockwerk;
    }

    public int getRaumNr() {
        return raumNr;
    }

    public int getStockwerk() {
        return stockwerk;
    }
}

