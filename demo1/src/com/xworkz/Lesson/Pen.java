package com.xworkz.Lesson;

public class Pen {
    private int inkLevel;
    private String brand;
    private double price;

    public Pen(int inkLevel, String brand, double price) {
        this.inkLevel = inkLevel;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pen [inkLevel=" + inkLevel + ", brand=" + brand + ", price=" + price + "]";
    }
}
