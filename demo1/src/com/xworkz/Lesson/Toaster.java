package com.xworkz.Lesson;

public class Toaster {
    private int slots;          // Number of slots in the toaster
    private String brand;       // Brand name of the toaster
    private double powerUsage;  // Power usage in watts

    public Toaster(int slots, String brand, double powerUsage) {
        this.slots = slots;
        this.brand = brand;
        this.powerUsage = powerUsage;
    }

    @Override
    public String toString() {
        return "Toaster [slots=" + slots + ", brand=" + brand + ", powerUsage=" + powerUsage + "]";
    }
    @Override
    public int hashCode(){
        return 17;
    }
}
