package com.xworkz.Lesson;

public class Monitor {
    private int sizeInInches;
    private String brand;
    private double price;

    public Monitor(int sizeInInches, String brand, double price) {
        this.sizeInInches = sizeInInches;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Monitor [sizeInInches=" + sizeInInches + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 47;
    }
}
