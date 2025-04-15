package com.xworkz.lesson;

public class Jeans {
    private int waistSize;
    private String brand;
    private double price;

    public Jeans(int waistSize, String brand, double price) {
        this.waistSize = waistSize;
        this.brand = brand;
        this.price = price;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Jeans) {
                System.out.println("Ref is Jeans, will compare...");
                Jeans other = (Jeans) obj;
                if ((this.waistSize == other.waistSize) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.price == other.price)) {
                    System.out.println("Both jeanss are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Jeans [waistSize=" + waistSize + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 62;
    }
}
