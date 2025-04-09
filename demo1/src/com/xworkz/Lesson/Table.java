package com.xworkz.Lesson;

public class Table {
    private int numberOfLegs;
    private String material;
    private double heightInCm;

    public Table(int numberOfLegs, String material, double heightInCm) {
        this.numberOfLegs = numberOfLegs;
        this.material = material;
        this.heightInCm = heightInCm;
    }

    @Override
    public String toString() {
        return "Table [numberOfLegs=" + numberOfLegs + ", material=" + material + ", heightInCm=" + heightInCm + "]";
    }
}
