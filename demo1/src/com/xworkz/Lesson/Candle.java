package com.xworkz.Lesson;

public class Candle {
    private int height;
    private String color;
    private double burnTime;

    public Candle(int height, String color, double burnTime) {
        this.height = height;
        this.color = color;
        this.burnTime = burnTime;
    }

    @Override
    public String toString() {
        return "Candle [height=" + height + ", color=" + color + ", burnTime=" + burnTime + "]";
    }
    @Override
    public int hashCode(){
        return 85;
    }
}
