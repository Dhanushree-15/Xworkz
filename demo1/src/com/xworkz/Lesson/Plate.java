package com.xworkz.Lesson;

public class Plate {
    private int diameter;
    private String material;
    private double price;

    public Plate(int diameter, String material, double price) {
        this.diameter = diameter;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Plate [diameter=" + diameter + ", material=" + material + ", price=" + price + "]";
    }
}
