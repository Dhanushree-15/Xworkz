package com.xworkz.Lesson;

public class Gloves {
    private int size;
    private String material;
    private double price;

    public Gloves(int size, String material, double price) {
        this.size = size;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Gloves [size=" + size + ", material=" + material + ", price=" + price + "]";
    }
}
