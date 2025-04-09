package com.xworkz.Lesson;

public class Marker {
    private int inkLevel;
    private String color;
    private double price;

    public Marker(int inkLevel, String color, double price) {
        this.inkLevel = inkLevel;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Marker [inkLevel=" + inkLevel + ", color=" + color + ", price=" + price + "]";
    }
}
