package com.xworkz.Lesson;

public class Truck {
    private int loadCapacity;     // Load capacity in tons
    private String modelName;     // Model or brand name of the truck
    private double mileage;       // Mileage in km per litre

    public Truck(int loadCapacity, String modelName, double mileage) {
        this.loadCapacity = loadCapacity;
        this.modelName = modelName;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Truck [loadCapacity=" + loadCapacity + ", modelName=" + modelName + ", mileage=" + mileage + "]";
    }
}
