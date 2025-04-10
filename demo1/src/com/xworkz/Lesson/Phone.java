package com.xworkz.Lesson;

public class Phone {
    private int modelNumber;
    private String brand;
    private double price;

    public Phone(int modelNumber, String brand, double price) {
        this.modelNumber = modelNumber;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Phone [modelNumber=" + modelNumber + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 39;
    }
}
