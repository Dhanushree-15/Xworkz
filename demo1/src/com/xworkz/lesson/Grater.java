package com.xworkz.lesson;

public class Grater {
    private int bladeCount;
    private String material;
    private double price;

    public Grater(int bladeCount, String material, double price) {
        this.bladeCount = bladeCount;
        this.material = material;
        this.price = price;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Grater) {
                System.out.println("Ref is Grater, will compare...");
                Grater other = (Grater) obj;
                if ((this.bladeCount == other.bladeCount) &&
                (this.material != null && this.material.equals(other.material)) &&
                (this.price == other.price)) {
                    System.out.println("Both graters are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Grater [bladeCount=" + bladeCount + ", material=" + material + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 67;
    }
}
