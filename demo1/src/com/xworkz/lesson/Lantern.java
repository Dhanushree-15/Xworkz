package com.xworkz.lesson;

public class Lantern {
    private int fuelCapacity;
    private String material;
    private double height;

    public Lantern(int fuelCapacity, String material, double height) {
        this.fuelCapacity = fuelCapacity;
        this.material = material;
        this.height = height;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Lantern) {
                System.out.println("Ref is Lantern, will compare...");
                Lantern other = (Lantern) obj;
                if ((this.fuelCapacity == other.fuelCapacity) &&
                (this.material != null && this.material.equals(other.material)) &&
                (this.height == other.height)) {
                    System.out.println("Both lanterns are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Lantern [fuelCapacity=" + fuelCapacity + ", material=" + material + ", height=" + height + "]";
    }
    @Override
    public int hashCode(){
        return 56;
    }
}
