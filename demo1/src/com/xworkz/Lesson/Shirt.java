package com.xworkz.Lesson;

public class Shirt {
    private int size;
    private String color;
    private double price;

    public Shirt(int size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shirt [size=" + size + ", color=" + color + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 30;
    }
}
