package com.xworkz.lesson;

public class Shampoo {
    private int quantityInML;
    private String brand;
    private double price;

    public Shampoo(int quantityInML, String brand, double price) {
        this.quantityInML = quantityInML;
        this.brand = brand;
        this.price = price;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Shampoo) {
                System.out.println("Ref is Shampoo, will compare...");
                Shampoo other = (Shampoo) obj;
                if ((this.quantityInML == other.quantityInML) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.price == other.price)) {
                    System.out.println("Both shampoos are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Shampoo [quantityInML=" + quantityInML + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 32;
    }
}
