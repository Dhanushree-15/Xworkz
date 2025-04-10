package com.xworkz.Lesson;

public class Ship {
    private int capacity;
    private String name;
    private double speed;

    public Ship(int capacity, String name, double speed) {
        this.capacity = capacity;
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Ship [capacity=" + capacity + ", name=" + name + ", speed=" + speed + "]";
    }
    @Override
    public int hashCode(){
        return 31;
    }
}
