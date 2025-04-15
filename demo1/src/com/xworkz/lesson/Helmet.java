package com.xworkz.lesson;

public class Helmet {
    private int size;
    private String brand;
    private double price;

    public Helmet(int size, String brand, double price) {
        this.size = size;
        this.brand = brand;
        this.price = price;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Helmet) {
                System.out.println("Ref is Helmet, will compare...");
                Helmet other = (Helmet) obj;
                if ((this.size == other.size) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.price == other.price)) {
                    System.out.println("Both helmets are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Helmet [size=" + size + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 64;
    }
}
