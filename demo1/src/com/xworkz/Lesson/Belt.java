package com.xworkz.Lesson;

public class Belt {
    private int beltId;
    private String material;
    private double length;

    public Belt(int beltId, String material, double length) {
        this.beltId = beltId;
        this.material = material;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Belt [beltId=" + beltId + ", material=" + material + ", length=" + length + "]";
    }
}
