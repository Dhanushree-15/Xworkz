package com.xworkz.lesson;

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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Tent) {
                System.out.println("Ref is Tent, will compare...");
                Tent other = (Tent) obj;
                if ((this.capacity == other.capacity) &&
                (this.color != null && this.color.equals(other.color)) &&
                (this.weight == other.weight)) {
                    System.out.println("Both tents are same");
                    return true;
                }
            }
        }
        return false;
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
