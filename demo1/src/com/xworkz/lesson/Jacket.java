package com.xworkz.lesson;

public class Jacket {
    private int size;
    private String color;
    private double price;

    public Jacket(int size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }


    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Jacket) {
                System.out.println("Ref is Jacket, will compare...");
                Jacket other = (Jacket) obj;
                if ((this.size == other.size) &&
                (this.color != null && this.color.equals(other.color)) &&
                (this.price == other.price)) {
                    System.out.println("Both jackets are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Jacket [size=" + size + ", color=" + color + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 63;
    }
}
