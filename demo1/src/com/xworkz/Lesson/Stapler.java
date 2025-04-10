package com.xworkz.Lesson;

public class Stapler {
    private int stapleCapacity;
    private String color;
    private double weightInGrams;

    public Stapler(int stapleCapacity, String color, double weightInGrams) {
        this.stapleCapacity = stapleCapacity;
        this.color = color;
        this.weightInGrams = weightInGrams;
    }

    @Override
    public String toString() {
        return "Stapler [stapleCapacity=" + stapleCapacity + ", color=" + color + ", weightInGrams=" + weightInGrams + "]";
    }
    @Override
    public int hashCode(){
        return 22;
    }
}
