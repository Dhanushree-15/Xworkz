package com.xworkz.lesson;

public class Matchbox {
    private int stickCount;
    private String brand;
    private double price;

    public Matchbox(int stickCount, String brand, double price) {
        this.stickCount = stickCount;
        this.brand = brand;
        this.price = price;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Matchbox) {
                System.out.println("Ref is Matchbox, will compare...");
                Matchbox other = (Matchbox) obj;
                if ((this.stickCount == other.stickCount) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.price == other.price)) {
                    System.out.println("Both matchboxs are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Matchbox [stickCount=" + stickCount + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 50;
    }
}
