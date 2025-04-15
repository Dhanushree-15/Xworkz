package com.xworkz.lesson;

public class Purse {
    private int compartments;
    private String brand;
    private double price;

    public Purse(int compartments, String brand, double price) {
        this.compartments = compartments;
        this.brand = brand;
        this.price = price;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Purse) {
                System.out.println("Ref is Purse, will compare...");
                Purse other = (Purse) obj;
                if ((this.compartments == other.compartments) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.price == other.price)) {
                    System.out.println("Both purses are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Purse [compartments=" + compartments + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 36;
    }
}
