package com.xworkz.Lesson;

public class Jeans {
    private int waistSize;
    private String brand;
    private double price;

    public Jeans(int waistSize, String brand, double price) {
        this.waistSize = waistSize;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Jeans [waistSize=" + waistSize + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 62;
    }
}
