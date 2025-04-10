package com.xworkz.Lesson;

public class Boat {
    private int capacity;
    private String type;
    private double length;

    public Boat(int capacity, String type, double length) {
        this.capacity = capacity;
        this.type = type;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Boat [capacity=" + capacity + ", type=" + type + ", length=" + length + "]";
    }
    @Override
    public int hashCode(){
        return 94;
    }

}
