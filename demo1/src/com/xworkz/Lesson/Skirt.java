package com.xworkz.Lesson;

public class Skirt {
    private int length;
    private String color;
    private double price;

    public Skirt(int length, String color, double price) {
        this.length = length;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Skirt [length=" + length + ", color=" + color + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 28;
    }
}
