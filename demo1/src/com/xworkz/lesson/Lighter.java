package com.xworkz.lesson;

public class Lighter {
    private int fuelCapacity;     // in ml
    private String brand;
    private double weight;        // in grams

    public Lighter(int fuelCapacity, String brand, double weight) {
        this.fuelCapacity = fuelCapacity;
        this.brand = brand;
        this.weight = weight;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Lighter) {
                System.out.println("Ref is Lighter, will compare...");
                Lighter other = (Lighter) obj;
                if ((this.fuelCapacity == other.fuelCapacity) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.weight == other.weight)) {
                    System.out.println("Both lighters are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Lighter [fuelCapacity=" + fuelCapacity + ", brand=" + brand + ", weight=" + weight + "]";
    }
    @Override
    public int hashCode(){
        return 54;
    }
}
