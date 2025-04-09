package com.xworkz.Lesson;

public class Matchbox {
    private int stickCount;
    private String brand;
    private double price;

    public Matchbox(int stickCount, String brand, double price) {
        this.stickCount = stickCount;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Matchbox [stickCount=" + stickCount + ", brand=" + brand + ", price=" + price + "]";
    }
}
