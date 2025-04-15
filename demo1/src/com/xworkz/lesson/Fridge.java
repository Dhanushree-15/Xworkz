package com.xworkz.lesson;

public class Fridge {
    private int capacity;
    private String brand;
    private double energyRating;

    public Fridge(int capacity, String brand, double energyRating) {
        this.capacity = capacity;
        this.brand = brand;
        this.energyRating = energyRating;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Fridge) {
                System.out.println("Ref is Fridge, will compare...");
                Fridge other = (Fridge) obj;
                if ((this.capacity == other.capacity) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.energyRating == other.energyRating)) {
                    System.out.println("Both fridges are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Fridge [capacity=" + capacity + ", brand=" + brand + ", energyRating=" + energyRating + "]";
    }
    @Override
    public int hashCode(){
        return 70;
    }
}
