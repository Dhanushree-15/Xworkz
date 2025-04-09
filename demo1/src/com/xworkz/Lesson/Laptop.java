package com.xworkz.Lesson;

public class Laptop {
    private int ramSize;         // in GB
    private String brand;
    private double processorSpeed; // in GHz

    public Laptop(int ramSize, String brand, double processorSpeed) {
        this.ramSize = ramSize;
        this.brand = brand;
        this.processorSpeed = processorSpeed;
    }

    @Override
    public String toString() {
        return "Laptop [ramSize=" + ramSize + ", brand=" + brand + ", processorSpeed=" + processorSpeed + "]";
    }
}
