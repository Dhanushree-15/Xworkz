package com.xworkz.Lesson;

public class Bag {
    private int bagId;
    private String bagType;
    private double price;

    public Bag(int bagId, String bagType, double price) {
        this.bagId = bagId;
        this.bagType = bagType;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bag [bagId=" + bagId + ", bagType=" + bagType + ", price=" + price + "]";
    }
}
