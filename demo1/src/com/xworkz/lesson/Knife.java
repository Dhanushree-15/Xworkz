package com.xworkz.lesson;

public class Knife {
    private int bladeLengthInCm;
    private String material;
    private double weightInGrams;

    public Knife(int bladeLengthInCm, String material, double weightInGrams) {
        this.bladeLengthInCm = bladeLengthInCm;
        this.material = material;
        this.weightInGrams = weightInGrams;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Knife) {
                System.out.println("Ref is Knife, will compare...");
                Knife other = (Knife) obj;
                if ((this.bladeLengthInCm == other.bladeLengthInCm) &&
                (this.material != null && this.material.equals(other.material)) &&
                (this.weightInGrams == other.weightInGrams)) {
                    System.out.println("Both knifes are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Knife [bladeLengthInCm=" + bladeLengthInCm + ", material=" + material + ", weightInGrams=" + weightInGrams + "]";
    }
    @Override
    public int hashCode(){
        return 58;
    }
}
