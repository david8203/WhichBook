package com.moringaschool.whichbook;

public class Book {
    private String name;
    private String author;
    private String imageUrl;
    private String description;
    private int pages;

    public Book(String name, String author, String imageUrl, String description, int pages) {
        this.name = name;
        this.author = author;
        this.imageUrl = imageUrl;
        this.description = description;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
    //we override the to string prints some info about the current object that we are in
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", description='" + description + '\'' +
                ", pages=" + pages +
                '}';
    }
}
