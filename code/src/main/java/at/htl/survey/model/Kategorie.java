package at.htl.survey.model;

public class Kategorie {
    private final int categoryId;
    private String categoryName;
    private String was;
    private String warum;

    public Kategorie(int categoryId, String categoryName) {
        this.categoryId = categoryId;
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

    @Override
    public String toString() {
        return "Kategorie{" +
                "categoryName='" + categoryName + '\'' +
                ", was='" + was + '\'' +
                ", warum='" + warum + '\'' +
                '}';
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;


    }
}
