package at.htl.survey.model;

public class Kategorie {
    private static int categoryId = 0;
    private String categoryName;
    private String was;
    private String warum;

    public Kategorie(String categoryName) {
        this.categoryId = ++categoryId;
        this.categoryName = categoryName;
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

    public int getCategoryId() {
        return categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}
