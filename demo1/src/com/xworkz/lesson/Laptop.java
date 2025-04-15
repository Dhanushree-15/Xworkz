package com.xworkz.lesson;

public class Laptop {
    private int ramSize;         // in GB
    private String brand;
    private double processorSpeed; // in GHz

    public Laptop(int ramSize, String brand, double processorSpeed) {
        this.ramSize = ramSize;
        this.brand = brand;
        this.processorSpeed = processorSpeed;
    }


    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Laptop) {
                System.out.println("Ref is Laptop, will compare...");
                Laptop other = (Laptop) obj;
                if ((this.ramSize == other.ramSize) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.processorSpeed == other.processorSpeed)) {
                    System.out.println("Both laptops are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Laptop [ramSize=" + ramSize + ", brand=" + brand + ", processorSpeed=" + processorSpeed + "]";
    }
    @Override
    public int hashCode(){
        return 55;
    }
}
