package com.xworkz.Lesson;

public class Knife {
    private int bladeLengthInCm;
    private String material;
    private double weightInGrams;

    public Knife(int bladeLengthInCm, String material, double weightInGrams) {
        this.bladeLengthInCm = bladeLengthInCm;
        this.material = material;
        this.weightInGrams = weightInGrams;
    }

    @Override
    public String toString() {
        return "Knife [bladeLengthInCm=" + bladeLengthInCm + ", material=" + material + ", weightInGrams=" + weightInGrams + "]";
    }
}
