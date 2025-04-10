package com.xworkz.Lesson;

public class Fridge {
    private int capacity;
    private String brand;
    private double energyRating;

    public Fridge(int capacity, String brand, double energyRating) {
        this.capacity = capacity;
        this.brand = brand;
        this.energyRating = energyRating;
    }

    @Override
    public String toString() {
        return "Fridge [capacity=" + capacity + ", brand=" + brand + ", energyRating=" + energyRating + "]";
    }
    @Override
    public int hashCode(){
        return 70;
    }
}
