package com.xworkz.Lesson;

public class Tent {
    private int capacity;        // Number of people it can accommodate
    private String color;        // Color of the tent
    private double weight;       // Weight of the tent in kilograms

    public Tent(int capacity, String color, double weight) {
        this.capacity = capacity;
        this.color = color;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Tent [capacity=" + capacity + ", color=" + color + ", weight=" + weight + "]";
    }
    @Override
    public int hashCode(){
        return 19;
    }
}
