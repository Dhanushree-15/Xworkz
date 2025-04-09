package com.xworkz.Lesson;

public class Bottle {
    private int volumeInMl;
    private String material;
    private double height;

    public Bottle(int volumeInMl, String material, double height) {
        this.volumeInMl = volumeInMl;
        this.material = material;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Bottle [volumeInMl=" + volumeInMl + ", material=" + material + ", height=" + height + "]";
    }
}
