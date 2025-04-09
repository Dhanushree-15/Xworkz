package com.xworkz.Lesson;

public class Chair {
    private int legs;
    private String material;
    private double height;

    public Chair(int legs, String material, double height) {
        this.legs = legs;
        this.material = material;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Chair [legs=" + legs + ", material=" + material + ", height=" + height + "]";
    }
}
