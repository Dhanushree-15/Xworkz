package com.xworkz.Lesson;

public class Spoon {
    private int lengthInCm;
    private String material;
    private double weightInGrams;

    public Spoon(int lengthInCm, String material, double weightInGrams) {
        this.lengthInCm = lengthInCm;
        this.material = material;
        this.weightInGrams = weightInGrams;
    }

    @Override
    public String toString() {
        return "Spoon [lengthInCm=" + lengthInCm + ", material=" + material + ", weightInGrams=" + weightInGrams + "]";
    }
}
