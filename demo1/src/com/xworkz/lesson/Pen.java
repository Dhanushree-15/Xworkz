package com.xworkz.lesson;

public class Pen {
    private int inkLevel;
    private String brand;
    private double price;

    public Pen(int inkLevel, String brand, double price) {
        this.inkLevel = inkLevel;
        this.brand = brand;
        this.price = price;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Pen) {
                System.out.println("Ref is Pen, will compare...");
                Pen other = (Pen) obj;
                if ((this.inkLevel == other.inkLevel) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.price == other.price)) {
                    System.out.println("Both pens are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Pen [inkLevel=" + inkLevel + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 41;
    }
}
