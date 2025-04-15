package com.xworkz.lesson;

public class Skirt {
    private int length;
    private String color;
    private double price;

    public Skirt(int length, String color, double price) {
        this.length = length;
        this.color = color;
        this.price = price;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Skirt) {
                System.out.println("Ref is Skirt, will compare...");
                Skirt other = (Skirt) obj;
                if ((this.length == other.length) &&
                (this.color != null && this.color.equals(other.color)) &&
                (this.price == other.price)) {
                    System.out.println("Both skirts are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Skirt [length=" + length + ", color=" + color + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 28;
    }
}
