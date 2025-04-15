package com.xworkz.lesson;

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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Kettle) {
                System.out.println("Ref is Kettle, will compare...");
                Kettle other = (Kettle) obj;
                if ((this.capacityInLiters == other.capacityInLiters) &&
                (this.material != null && this.material.equals(other.material)) &&
                (this.price == other.price)) {
                    System.out.println("Both kettles are same");
                    return true;
                }
            }
        }
        return false;
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
