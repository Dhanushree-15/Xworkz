package com.xworkz.lesson;

public class Shirt {
    private int size;
    private String color;
    private double price;

    public Shirt(int size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Shirt) {
                System.out.println("Ref is Shirt, will compare...");
                Shirt other = (Shirt) obj;
                if ((this.size == other.size) &&
                (this.color != null && this.color.equals(other.color)) &&
                (this.price == other.price)) {
                    System.out.println("Both shirts are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Shirt [size=" + size + ", color=" + color + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 30;
    }
}
