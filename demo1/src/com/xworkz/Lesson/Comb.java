package com.xworkz.Lesson;

public class Comb {
    private int teethCount;
    private String material;
    private double length;

    public Comb(int teethCount, String material, double length) {
        this.teethCount = teethCount;
        this.material = material;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Comb [teethCount=" + teethCount + ", material=" + material + ", length=" + length + "]";
    }
}
