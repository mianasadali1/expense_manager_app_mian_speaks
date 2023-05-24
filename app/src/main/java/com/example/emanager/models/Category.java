package com.example.emanager.models;

public class Category {
    private String categoryName;
    private int categoryImage;

    private int categoryColor;

    public Category() {
    }

    public Category(String categoryName, int categoryImage, int categoryColor) {
        this.categoryName = categoryName;
        this.categoryImage = categoryImage;
        this.categoryColor = categoryColor;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCategoryImage() {
        return categoryImage;
    }

    public void setCategoryImage(int categoryImage) {
        this.categoryImage = categoryImage;
    }

    public int getCategoryColor() {
        return categoryColor;
    }

    public void setCategoryColor(int categoryColor) {
        this.categoryColor = categoryColor;
    }
}
