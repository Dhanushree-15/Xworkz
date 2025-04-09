package com.xworkz.Lesson;

public class Lighter {
    private int fuelCapacity;     // in ml
    private String brand;
    private double weight;        // in grams

    public Lighter(int fuelCapacity, String brand, double weight) {
        this.fuelCapacity = fuelCapacity;
        this.brand = brand;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Lighter [fuelCapacity=" + fuelCapacity + ", brand=" + brand + ", weight=" + weight + "]";
    }
}
