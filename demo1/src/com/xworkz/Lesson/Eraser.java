package com.xworkz.Lesson;

public class Eraser {
    private int lengthInCm;
    private String brand;
    private double price;

    public Eraser(int lengthInCm, String brand, double price) {
        this.lengthInCm = lengthInCm;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Eraser [lengthInCm=" + lengthInCm + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 74;
    }
}
