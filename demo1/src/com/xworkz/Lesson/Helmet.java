package com.xworkz.Lesson;

public class Helmet {
    private int size;
    private String brand;
    private double price;

    public Helmet(int size, String brand, double price) {
        this.size = size;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Helmet [size=" + size + ", brand=" + brand + ", price=" + price + "]";
    }
}
