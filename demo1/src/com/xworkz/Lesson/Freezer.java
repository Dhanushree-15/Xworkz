package com.xworkz.Lesson;

public class Freezer {
    private int capacityInLiters;
    private String brand;
    private double temperatureSetting;

    public Freezer(int capacityInLiters, String brand, double temperatureSetting) {
        this.capacityInLiters = capacityInLiters;
        this.brand = brand;
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public String toString() {
        return "Freezer [capacityInLiters=" + capacityInLiters + ", brand=" + brand + ", temperatureSetting=" + temperatureSetting + "]";
    }
}
