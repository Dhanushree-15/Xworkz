package com.xworkz.Accesscontrol;

public class Book {
    public String title;
    private String author;
    public void setAuthor(String author) {
        this.author = author;
    }
    public void showBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
