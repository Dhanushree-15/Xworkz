package com.xworkz.Lesson;

public class Cup {
    private int capacityInMl;
    private String material;
    private double price;

    public Cup(int capacityInMl, String material, double price) {
        this.capacityInMl = capacityInMl;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cup [capacityInMl=" + capacityInMl + ", material=" + material + ", price=" + price + "]";
    }
}
