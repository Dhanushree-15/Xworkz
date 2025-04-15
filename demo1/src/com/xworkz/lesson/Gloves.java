package com.xworkz.lesson;

public class Gloves {
    private int size;
    private String material;
    private double price;

    public Gloves(int size, String material, double price) {
        this.size = size;
        this.material = material;
        this.price = price;
    }


    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Gloves) {
                System.out.println("Ref is Gloves, will compare...");
                Gloves other = (Gloves) obj;
                if ((this.size == other.size) &&
                (this.material != null && this.material.equals(other.material)) &&
                (this.price == other.price)) {
                    System.out.println("Both glovess are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Gloves [size=" + size + ", material=" + material + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 68;
    }
}
