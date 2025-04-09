package com.xworkz.Lesson;

public class Grater {
    private int bladeCount;
    private String material;
    private double price;

    public Grater(int bladeCount, String material, double price) {
        this.bladeCount = bladeCount;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Grater [bladeCount=" + bladeCount + ", material=" + material + ", price=" + price + "]";
    }
}
