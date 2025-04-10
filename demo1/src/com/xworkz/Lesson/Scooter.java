package com.xworkz.Lesson;

public class Scooter {
    private int engineCC;
    private String brand;
    private double mileage;

    public Scooter(int engineCC, String brand, double mileage) {
        this.engineCC = engineCC;
        this.brand = brand;
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Scooter [engineCC=" + engineCC + ", brand=" + brand + ", mileage=" + mileage + "]";
    }
    @Override
    public int hashCode(){
        return 33;
    }
}
