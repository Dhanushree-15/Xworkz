package com.xworkz.lesson;

public class Toothbrush {
    private int bristleCount;      // Number of bristles
    private String brand;          // Brand name of the toothbrush
    private double price;          // Price of the toothbrush

    public Toothbrush(int bristleCount, String brand, double price) {
        this.bristleCount = bristleCount;
        this.brand = brand;
        this.price = price;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Toothbrush) {
                System.out.println("Ref is Toothbrush, will compare...");
                Toothbrush other = (Toothbrush) obj;
                if ((this.bristleCount == other.bristleCount) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.price == other.price)) {
                    System.out.println("Both toothbrushs are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Toothbrush [bristleCount=" + bristleCount + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 16;
    }
}
