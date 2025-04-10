package com.xworkz.Lesson;

public class Brush {
    private int bristleCount;
    private String brushType;
    private double length;

    public Brush(int bristleCount, String brushType, double length) {
        this.bristleCount = bristleCount;
        this.brushType = brushType;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Brush [bristleCount=" + bristleCount + ", brushType=" + brushType + ", length=" + length + "]";
    }
    @Override
    public int hashCode(){
        return 90;
    }
}
