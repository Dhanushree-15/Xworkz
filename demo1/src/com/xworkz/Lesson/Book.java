package com.xworkz.Lesson;

public class Book {
    private int pageCount;
    private String title;
    private double price;

    public Book(int pageCount, String title, double price) {
        this.pageCount = pageCount;
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book [pageCount=" + pageCount + ", title=" + title + ", price=" + price + "]";
    }
}
