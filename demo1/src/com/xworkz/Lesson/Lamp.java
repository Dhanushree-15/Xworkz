package com.xworkz.Lesson;

public class Lamp {
    private int brightnessLevel;
    private String color;
    private double heightInInches;

    public Lamp(int brightnessLevel, String color, double heightInInches) {
        this.brightnessLevel = brightnessLevel;
        this.color = color;
        this.heightInInches = heightInInches;
    }

    @Override
    public String toString() {
        return "Lamp [brightnessLevel=" + brightnessLevel + ", color=" + color + ", heightInInches=" + heightInInches + "]";
    }
    @Override
    public int hashCode(){
        return 57;
    }
}
