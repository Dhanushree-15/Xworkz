package com.xworkz.lesson;

public class Spoon {
    private int lengthInCm;
    private String material;
    private double weightInGrams;

    public Spoon(int lengthInCm, String material, double weightInGrams) {
        this.lengthInCm = lengthInCm;
        this.material = material;
        this.weightInGrams = weightInGrams;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Spoon) {
                System.out.println("Ref is Spoon, will compare...");
                Spoon other = (Spoon) obj;
                if ((this.lengthInCm == other.lengthInCm) &&
                (this.material != null && this.material.equals(other.material)) &&
                (this.weightInGrams == other.weightInGrams)) {
                    System.out.println("Both spoons are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Spoon [lengthInCm=" + lengthInCm + ", material=" + material + ", weightInGrams=" + weightInGrams + "]";
    }
    @Override
    public int hashCode(){
        return 23;
    }
}
