package com.xworkz.Lesson;

public class Scissors {
    private int bladeLength;
    private String handleMaterial;
    private double weight;

    public Scissors(int bladeLength, String handleMaterial, double weight) {
        this.bladeLength = bladeLength;
        this.handleMaterial = handleMaterial;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Scissors [bladeLength=" + bladeLength + ", handleMaterial=" + handleMaterial + ", weight=" + weight + "]";
    }
    @Override
    public int hashCode(){
        return 34;
    }
}
