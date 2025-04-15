package com.xworkz.lesson;

public class Socks {
    private int size;
    private String color;
    private double price;

    public Socks(int size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Socks) {
                System.out.println("Ref is Socks, will compare...");
                Socks other = (Socks) obj;
                if ((this.size == other.size) &&
                (this.color != null && this.color.equals(other.color)) &&
                (this.price == other.price)) {
                    System.out.println("Both sockss are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Socks [size=" + size + ", color=" + color + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 26;
    }
}
