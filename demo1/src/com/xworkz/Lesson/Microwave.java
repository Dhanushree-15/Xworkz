package com.xworkz.Lesson;

public class Microwave {
    private int powerWatts;
    private String brand;
    private double capacityLitres;

    public Microwave(int powerWatts, String brand, double capacityLitres) {
        this.powerWatts = powerWatts;
        this.brand = brand;
        this.capacityLitres = capacityLitres;
    }

    @Override
    public String toString() {
        return "Microwave [powerWatts=" + powerWatts + ", brand=" + brand + ", capacityLitres=" + capacityLitres + "]";
    }
    @Override
    public int hashCode(){
        return 49;
    }
}
