package com.xworkz.Lesson;

public class Lantern {
    private int fuelCapacity;
    private String material;
    private double height;

    public Lantern(int fuelCapacity, String material, double height) {
        this.fuelCapacity = fuelCapacity;
        this.material = material;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Lantern [fuelCapacity=" + fuelCapacity + ", material=" + material + ", height=" + height + "]";
    }
}
