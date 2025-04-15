package com.xworkz.lesson;

public class Marker {
    private int inkLevel;
    private String color;
    private double price;

    public Marker(int inkLevel, String color, double price) {
        this.inkLevel = inkLevel;
        this.color = color;
        this.price = price;
    }


    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Marker) {
                System.out.println("Ref is Marker, will compare...");
                Marker other = (Marker) obj;
                if ((this.inkLevel == other.inkLevel) &&
                (this.color != null && this.color.equals(other.color)) &&
                (this.price == other.price)) {
                    System.out.println("Both markers are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Marker [inkLevel=" + inkLevel + ", color=" + color + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 51;
    }
}
