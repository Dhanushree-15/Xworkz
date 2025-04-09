package com.xworkz.Lesson;

public class Hat {
    private int size;
    private String color;
    private double price;

    public Hat(int size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Hat [size=" + size + ", color=" + color + ", price=" + price + "]";
    }
}
