package com.xworkz.Lesson;

public class Binoculars {
    private int zoomLevel;
    private String brand;
    private double weight;

    public Binoculars(int zoomLevel, String brand, double weight) {
        this.zoomLevel = zoomLevel;
        this.brand = brand;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Binoculars [zoomLevel=" + zoomLevel + ", brand=" + brand + ", weight=" + weight + "]";
    }
}
