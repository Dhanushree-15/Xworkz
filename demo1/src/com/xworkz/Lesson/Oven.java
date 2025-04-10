package com.xworkz.Lesson;

public class Oven {
    private int capacity;
    private String brand;
    private double power;

    public Oven(int capacity, String brand, double power) {
        this.capacity = capacity;
        this.brand = brand;
        this.power = power;
    }

    @Override
    public String toString() {
        return "Oven [capacity=" + capacity + ", brand=" + brand + ", power=" + power + "]";
    }
    @Override
    public int hashCode(){
        return 43;
    }
}
