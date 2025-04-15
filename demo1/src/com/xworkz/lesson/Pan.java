package com.xworkz.lesson;

public class Pan {
    private int diameter;
    private String material;
    private double price;

    public Pan(int diameter, String material, double price) {
        this.diameter = diameter;
        this.material = material;
        this.price = price;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Pan) {
                System.out.println("Ref is Pan, will compare...");
                Pan other = (Pan) obj;
                if ((this.diameter == other.diameter) &&
                (this.material != null && this.material.equals(other.material)) &&
                (this.price == other.price)) {
                    System.out.println("Both pans are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Pan [diameter=" + diameter + ", material=" + material + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 42;
    }
}
