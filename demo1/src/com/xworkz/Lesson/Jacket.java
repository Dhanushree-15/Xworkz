package com.xworkz.Lesson;

public class Jacket {
    private int size;
    private String color;
    private double price;

    public Jacket(int size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Jacket [size=" + size + ", color=" + color + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 63;
    }
}
