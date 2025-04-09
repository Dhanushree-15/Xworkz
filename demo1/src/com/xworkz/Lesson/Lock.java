package com.xworkz.Lesson;

public class Lock {
    private int securityLevel;
    private String material;
    private double price;

    public Lock(int securityLevel, String material, double price) {
        this.securityLevel = securityLevel;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Lock [securityLevel=" + securityLevel + ", material=" + material + ", price=" + price + "]";
    }
}
