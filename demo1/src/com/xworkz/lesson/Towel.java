package com.xworkz.lesson;

public class Towel {
    private int length;         // Length of the towel in cm
    private String material;    // Material of the towel (e.g., cotton, microfiber)
    private double price;       // Price of the towel

    public Towel(int length, String material, double price) {
        this.length = length;
        this.material = material;
        this.price = price;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Towel) {
                System.out.println("Ref is Towel, will compare...");
                Towel other = (Towel) obj;
                if ((this.length == other.length) &&
                (this.material != null && this.material.equals(other.material)) &&
                (this.price == other.price)) {
                    System.out.println("Both towels are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Towel [length=" + length + ", material=" + material + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 15;
    }
}
