package com.xworkz.Lesson;

public class Carpet {
    private int length;
    private String material;
    private double price;

    public Carpet(int length, String material, double price) {
        this.length = length;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Carpet [length=" + length + ", material=" + material + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 82;
    }
}
