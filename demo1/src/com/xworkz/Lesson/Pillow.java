package com.xworkz.Lesson;

public class Pillow {
    private int size;
    private String material;
    private double price;

    public Pillow(int size, String material, double price) {
        this.size = size;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pillow [size=" + size + ", material=" + material + ", price=" + price + "]";
    }
}
