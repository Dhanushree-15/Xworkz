package com.xworkz.Lesson;

public class Clock {
    private int hourFormat;
    private String brand;
    private double diameter;

    public Clock(int hourFormat, String brand, double diameter) {
        this.hourFormat = hourFormat;
        this.brand = brand;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Clock [hourFormat=" + hourFormat + ", brand=" + brand + ", diameter=" + diameter + "]";
    }
    @Override
    public int hashCode(){
        return 79;
    }
}
