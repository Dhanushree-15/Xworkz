package com.xworkz.Lesson;

public class Blender {
    private int speedLevels;
    private String brand;
    private double capacity;

    public Blender(int speedLevels, String brand, double capacity) {
        this.speedLevels = speedLevels;
        this.brand = brand;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Blender [speedLevels=" + speedLevels + ", brand=" + brand + ", capacity=" + capacity + "]";
    }
}
