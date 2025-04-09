package com.xworkz.Lesson;

public class Note {
    private int pageCount;
    private String brand;
    private double price;

    public Note(int pageCount, String brand, double price) {
        this.pageCount = pageCount;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Note [pageCount=" + pageCount + ", brand=" + brand + ", price=" + price + "]";
    }
}
