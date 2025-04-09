package com.xworkz.Lesson;

public class Watch {
    private int warrantyYears;      // Warranty period in years
    private String brand;           // Brand of the watch
    private double price;           // Price of the watch

    public Watch(int warrantyYears, String brand, double price) {
        this.warrantyYears = warrantyYears;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Watch [warrantyYears=" + warrantyYears + ", brand=" + brand + ", price=" + price + "]";
    }
}
