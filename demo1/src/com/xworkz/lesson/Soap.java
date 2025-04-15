package com.xworkz.lesson;

public class Soap {
    private int weight;
    private String fragrance;
    private double price;

    public Soap(int weight, String fragrance, double price) {
        this.weight = weight;
        this.fragrance = fragrance;
        this.price = price;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Soap) {
                System.out.println("Ref is Soap, will compare...");
                Soap other = (Soap) obj;
                if ((this.weight == other.weight) &&
                (this.fragrance != null && this.fragrance.equals(other.fragrance)) &&
                (this.price == other.price)) {
                    System.out.println("Both soaps are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Soap [weight=" + weight + ", fragrance=" + fragrance + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 27;
    }
}
