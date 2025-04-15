package com.xworkz.lesson;

public class Toaster {
    private int slots;          // Number of slots in the toaster
    private String brand;       // Brand name of the toaster
    private double powerUsage;  // Power usage in watts

    public Toaster(int slots, String brand, double powerUsage) {
        this.slots = slots;
        this.brand = brand;
        this.powerUsage = powerUsage;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Toaster) {
                System.out.println("Ref is Toaster, will compare...");
                Toaster other = (Toaster) obj;
                if ((this.slots == other.slots) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.powerUsage == other.powerUsage)) {
                    System.out.println("Both toasters are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Toaster [slots=" + slots + ", brand=" + brand + ", powerUsage=" + powerUsage + "]";
    }
    @Override
    public int hashCode(){
        return 17;
    }
}
