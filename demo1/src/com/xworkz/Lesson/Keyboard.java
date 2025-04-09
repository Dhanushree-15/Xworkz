package com.xworkz.Lesson;

public class Keyboard {
    private int numberOfKeys;
    private String type;
    private double weightInGrams;

    public Keyboard(int numberOfKeys, String type, double weightInGrams) {
        this.numberOfKeys = numberOfKeys;
        this.type = type;
        this.weightInGrams = weightInGrams;
    }

    @Override
    public String toString() {
        return "Keyboard [numberOfKeys=" + numberOfKeys + ", type=" + type + ", weightInGrams=" + weightInGrams + "]";
    }
}
