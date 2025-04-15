package com.xworkz.lesson;

public class Plate {
    private int diameter;
    private String material;
    private double price;

    public Plate(int diameter, String material, double price) {
        this.diameter = diameter;
        this.material = material;
        this.price = price;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Plate) {
                System.out.println("Ref is Plate, will compare...");
                Plate other = (Plate) obj;
                if ((this.diameter == other.diameter) &&
                (this.material != null && this.material.equals(other.material)) &&
                (this.price == other.price)) {
                    System.out.println("Both plates are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Plate [diameter=" + diameter + ", material=" + material + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 37;
    }
}
