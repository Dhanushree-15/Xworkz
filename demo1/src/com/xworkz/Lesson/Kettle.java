package com.xworkz.Lesson;

public class Kettle {
    private int capacityInLiters;
    private String material;
    private double price;

    public Kettle(int capacityInLiters, String material, double price) {
        this.capacityInLiters = capacityInLiters;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Kettle [capacityInLiters=" + capacityInLiters + ", material=" + material + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 61;
    }
}
