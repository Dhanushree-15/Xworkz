package com.xworkz.Lesson;

public class Rope {
    private int length;
    private String material;
    private double thickness;

    public Rope(int length, String material, double thickness) {
        this.length = length;
        this.material = material;
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Rope [length=" + length + ", material=" + material + ", thickness=" + thickness + "]";
    }
    @Override
    public int hashCode(){
        return 36;
    }
}
