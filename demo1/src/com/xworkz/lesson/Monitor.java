package com.xworkz.lesson;

public class Monitor {
    private int sizeInInches;
    private String brand;
    private double price;

    public Monitor(int sizeInInches, String brand, double price) {
        this.sizeInInches = sizeInInches;
        this.brand = brand;
        this.price = price;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Monitor) {
                System.out.println("Ref is Monitor, will compare...");
                Monitor other = (Monitor) obj;
                if ((this.sizeInInches == other.sizeInInches) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.price == other.price)) {
                    System.out.println("Both monitors are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Monitor [sizeInInches=" + sizeInInches + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 47;
    }
}
