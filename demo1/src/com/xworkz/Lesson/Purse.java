package com.xworkz.Lesson;

public class Purse {
    private int compartments;
    private String brand;
    private double price;

    public Purse(int compartments, String brand, double price) {
        this.compartments = compartments;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Purse [compartments=" + compartments + ", brand=" + brand + ", price=" + price + "]";
    }
}
