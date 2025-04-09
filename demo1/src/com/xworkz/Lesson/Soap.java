package com.xworkz.Lesson;

public class Soap {
    private int weight;
    private String fragrance;
    private double price;

    public Soap(int weight, String fragrance, double price) {
        this.weight = weight;
        this.fragrance = fragrance;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Soap [weight=" + weight + ", fragrance=" + fragrance + ", price=" + price + "]";
    }
}
