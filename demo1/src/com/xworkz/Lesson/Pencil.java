package com.xworkz.Lesson;

public class Pencil {
    private int length;
    private String brand;
    private double price;

    public Pencil(int length, String brand, double price) {
        this.length = length;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pencil [length=" + length + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 40;
    }
}
