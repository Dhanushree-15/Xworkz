package com.xworkz.Lesson;

public class Charger {
    private int wattage;
    private String brand;
    private double voltage;

    public Charger(int wattage, String brand, double voltage) {
        this.wattage = wattage;
        this.brand = brand;
        this.voltage = voltage;
    }

    @Override
    public String toString() {
        return "Charger [wattage=" + wattage + ", brand=" + brand + ", voltage=" + voltage + "]";
    }
}
