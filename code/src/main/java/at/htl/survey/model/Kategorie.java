package at.htl.survey.model;

public class Kategorie {
    private static int categoryId = 0;
    private String categoryName;

    public Kategorie(String categoryName) {
        this.categoryId = ++categoryId;
        this.categoryName = categoryName;
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
