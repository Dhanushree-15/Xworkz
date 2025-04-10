package com.xworkz.Lesson;

public class Sofa {
    private int numberOfSeats;
    private String material;
    private double price;

    public Sofa(int numberOfSeats, String material, double price) {
        this.numberOfSeats = numberOfSeats;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Sofa [numberOfSeats=" + numberOfSeats + ", material=" + material + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 25;
    }
}
