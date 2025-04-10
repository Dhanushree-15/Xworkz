package com.xworkz.Lesson;

public class Toothbrush {
    private int bristleCount;      // Number of bristles
    private String brand;          // Brand name of the toothbrush
    private double price;          // Price of the toothbrush

    public Toothbrush(int bristleCount, String brand, double price) {
        this.bristleCount = bristleCount;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Toothbrush [bristleCount=" + bristleCount + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 16;
    }
}
