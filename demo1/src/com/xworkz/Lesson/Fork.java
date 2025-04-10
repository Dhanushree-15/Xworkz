package com.xworkz.Lesson;

public class Fork {
    private int prongCount;
    private String material;
    private double length;

    public Fork(int prongCount, String material, double length) {
        this.prongCount = prongCount;
        this.material = material;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Fork [prongCount=" + prongCount + ", material=" + material + ", length=" + length + "]";
    }
    @Override
    public int hashCode(){
        return 72;
    }
}
