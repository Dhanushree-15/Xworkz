package com.xworkz.Lesson;

public class Blanket {
    private int thickness;
    private String material;
    private double length;

    public Blanket(int thickness, String material, double length) {
        this.thickness = thickness;
        this.material = material;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Blanket [thickness=" + thickness + ", material=" + material + ", length=" + length + "]";
    }
    @Override
    public int hashCode(){
        return 94;
    }

}
