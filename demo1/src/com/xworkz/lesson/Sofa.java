package com.xworkz.lesson;

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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Sofa) {
                System.out.println("Ref is Sofa, will compare...");
                Sofa other = (Sofa) obj;
                if ((this.numberOfSeats == other.numberOfSeats) &&
                (this.material != null && this.material.equals(other.material)) &&
                (this.price == other.price)) {
                    System.out.println("Both sofas are same");
                    return true;
                }
            }
        }
        return false;
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
