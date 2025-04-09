package com.xworkz.Lesson;

public class Ruler {
    private int length;
    private String material;
    private double width;

    public Ruler(int length, String material, double width) {
        this.length = length;
        this.material = material;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Ruler [length=" + length + ", material=" + material + ", width=" + width + "]";
    }
}
