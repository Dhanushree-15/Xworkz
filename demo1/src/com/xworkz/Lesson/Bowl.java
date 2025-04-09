package com.xworkz.Lesson;

public class Bowl {
    private int capacityInMl;
    private String material;
    private double diameter;

    public Bowl(int capacityInMl, String material, double diameter) {
        this.capacityInMl = capacityInMl;
        this.material = material;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Bowl [capacityInMl=" + capacityInMl + ", material=" + material + ", diameter=" + diameter + "]";
    }
}
