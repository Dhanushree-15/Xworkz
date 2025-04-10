package com.xworkz.Lesson;

public class Socks {
    private int size;
    private String color;
    private double price;

    public Socks(int size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Socks [size=" + size + ", color=" + color + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 26;
    }
}
