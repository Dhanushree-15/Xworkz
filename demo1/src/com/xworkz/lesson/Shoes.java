package com.xworkz.lesson;

public class Shoes {
    private int size;
    private String brand;
    private double price;

    public Shoes(int size, String brand, double price) {
        this.size = size;
        this.brand = brand;
        this.price = price;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Shoes) {
                System.out.println("Ref is Shoes, will compare...");
                Shoes other = (Shoes) obj;
                if ((this.size == other.size) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.price == other.price)) {
                    System.out.println("Both shoess are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Shoes [size=" + size + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 29;
    }
}
