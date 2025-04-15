package com.xworkz.lesson;

public class Keyboard {
    private int numberOfKeys;
    private String type;
    private double weightInGrams;

    public Keyboard(int numberOfKeys, String type, double weightInGrams) {
        this.numberOfKeys = numberOfKeys;
        this.type = type;
        this.weightInGrams = weightInGrams;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Keyboard) {
                System.out.println("Ref is Keyboard, will compare...");
                Keyboard other = (Keyboard) obj;
                if ((this.numberOfKeys == other.numberOfKeys) &&
                (this.type != null && this.type.equals(other.type)) &&
                (this.weightInGrams == other.weightInGrams)) {
                    System.out.println("Both keyboards are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Keyboard [numberOfKeys=" + numberOfKeys + ", type=" + type + ", weightInGrams=" + weightInGrams + "]";
    }
    @Override
    public int hashCode(){
        return 59;
    }
}
