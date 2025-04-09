package com.xworkz.Lesson;

public class Glasses {
    private int lensPower;
    private String frameType;
    private double price;

    public Glasses(int lensPower, String frameType, double price) {
        this.lensPower = lensPower;
        this.frameType = frameType;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Glasses [lensPower=" + lensPower + ", frameType=" + frameType + ", price=" + price + "]";
    }
}
