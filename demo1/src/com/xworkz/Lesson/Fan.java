package com.xworkz.Lesson;

public class Fan {
    private int speedLevels;
    private String brand;
    private double powerConsumption;

    public Fan(int speedLevels, String brand, double powerConsumption) {
        this.speedLevels = speedLevels;
        this.brand = brand;
        this.powerConsumption = powerConsumption;
    }

    @Override
    public String toString() {
        return "Fan [speedLevels=" + speedLevels + ", brand=" + brand + ", powerConsumption=" + powerConsumption + "]";
    }
}
