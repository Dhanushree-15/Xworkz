package com.xworkz.Lesson;

public class Bicycle {
    private int gearCount;
    private String brand;
    private double wheelSize;

    public Bicycle(int gearCount, String brand, double wheelSize) {
        this.gearCount = gearCount;
        this.brand = brand;
        this.wheelSize = wheelSize;
    }

    @Override
    public String toString() {
        return "Bicycle [gearCount=" + gearCount + ", brand=" + brand + ", wheelSize=" + wheelSize + "]";
    }
    @Override
    public int hashCode(){
        return 96;
    }

}
