package com.xworkz.Lesson;

public class Door {
    private int heightInInches;
    private String material;
    private double price;

    public Door(int heightInInches, String material, double price) {
        this.heightInInches = heightInInches;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Door [heightInInches=" + heightInInches + ", material=" + material + ", price=" + price + "]";
    }
}
