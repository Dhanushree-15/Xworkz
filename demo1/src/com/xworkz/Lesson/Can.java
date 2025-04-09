package com.xworkz.Lesson;

public class Can {
    private int capacity;
    private String material;
    private double price;

    public Can(int capacity, String material, double price) {
        this.capacity = capacity;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Can [capacity=" + capacity + ", material=" + material + ", price=" + price + "]";
    }
}
