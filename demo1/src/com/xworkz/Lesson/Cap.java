package com.xworkz.Lesson;

public class Cap {
    private int size;
    private String color;
    private double price;

    public Cap(int size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cap [size=" + size + ", color=" + color + ", price=" + price + "]";
    }
}
