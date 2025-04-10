package com.xworkz.Lesson;

public class Car {
    private int modelYear;
    private String brand;
    private double price;

    public Car(int modelYear, String brand, double price) {
        this.modelYear = modelYear;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car [modelYear=" + modelYear + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 83;
    }
}
