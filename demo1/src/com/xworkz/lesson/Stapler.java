package com.xworkz.lesson;

public class Stapler {
    private int stapleCapacity;
    private String color;
    private double weightInGrams;

    public Stapler(int stapleCapacity, String color, double weightInGrams) {
        this.stapleCapacity = stapleCapacity;
        this.color = color;
        this.weightInGrams = weightInGrams;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Stapler) {
                System.out.println("Ref is Stapler, will compare...");
                Stapler other = (Stapler) obj;
                if ((this.stapleCapacity == other.stapleCapacity) &&
                (this.color != null && this.color.equals(other.color)) &&
                (this.weightInGrams == other.weightInGrams)) {
                    System.out.println("Both staplers are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Stapler [stapleCapacity=" + stapleCapacity + ", color=" + color + ", weightInGrams=" + weightInGrams + "]";
    }
    @Override
    public int hashCode(){
        return 22;
    }
}
