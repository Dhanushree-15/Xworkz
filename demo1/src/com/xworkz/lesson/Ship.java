package com.xworkz.lesson;

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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Ship) {
                System.out.println("Ref is Ship, will compare...");
                Ship other = (Ship) obj;
                if ((this.capacity == other.capacity) &&
                (this.name != null && this.name.equals(other.name)) &&
                (this.speed == other.speed)) {
                    System.out.println("Both ships are same");
                    return true;
                }
            }
        }
        return false;
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
