package com.xworkz.lesson;

public class Hat {
    private int size;
    private String color;
    private double price;

    public Hat(int size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Hat) {
                System.out.println("Ref is Hat, will compare...");
                Hat other = (Hat) obj;
                if ((this.size == other.size) &&
                (this.color != null && this.color.equals(other.color)) &&
                (this.price == other.price)) {
                    System.out.println("Both hats are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Hat [size=" + size + ", color=" + color + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 66;
    }
}
