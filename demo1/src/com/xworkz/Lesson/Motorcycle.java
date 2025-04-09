package com.xworkz.Lesson;

public class Motorcycle {
    private int engineCapacity;
    private String brand;
    private double price;

    public Motorcycle(int engineCapacity, String brand, double price) {
        this.engineCapacity = engineCapacity;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Motorcycle [engineCapacity=" + engineCapacity + ", brand=" + brand + ", price=" + price + "]";
    }
}
