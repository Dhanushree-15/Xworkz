package com.xworkz.Lesson;

public class Television {
    private int screenSizeInInches;
    private String brand;
    private double price;

    public Television(int screenSizeInInches, String brand, double price) {
        this.screenSizeInInches = screenSizeInInches;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Television [screenSizeInInches=" + screenSizeInInches + ", brand=" + brand + ", price=" + price + "]";
    }
}
