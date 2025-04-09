package com.xworkz.Lesson;

public class Shoes {
    private int size;
    private String brand;
    private double price;

    public Shoes(int size, String brand, double price) {
        this.size = size;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shoes [size=" + size + ", brand=" + brand + ", price=" + price + "]";
    }
}
