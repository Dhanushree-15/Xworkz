package com.xworkz.lesson;

public class Pencil {
    private int length;
    private String brand;
    private double price;

    public Pencil(int length, String brand, double price) {
        this.length = length;
        this.brand = brand;
        this.price = price;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Pencil) {
                System.out.println("Ref is Pencil, will compare...");
                Pencil other = (Pencil) obj;
                if ((this.length == other.length) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.price == other.price)) {
                    System.out.println("Both pencils are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Pencil [length=" + length + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 40;
    }
}
