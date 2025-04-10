package com.xworkz.Lesson;

public class Towel {
    private int length;         // Length of the towel in cm
    private String material;    // Material of the towel (e.g., cotton, microfiber)
    private double price;       // Price of the towel

    public Towel(int length, String material, double price) {
        this.length = length;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Towel [length=" + length + ", material=" + material + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 15;
    }
}
