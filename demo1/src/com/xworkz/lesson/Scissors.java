package com.xworkz.lesson;

public class Scissors {
    private int bladeLength;
    private String handleMaterial;
    private double weight;

    public Scissors(int bladeLength, String handleMaterial, double weight) {
        this.bladeLength = bladeLength;
        this.handleMaterial = handleMaterial;
        this.weight = weight;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Scissors) {
                System.out.println("Ref is Scissors, will compare...");
                Scissors other = (Scissors) obj;
                if ((this.bladeLength == other.bladeLength) &&
                (this.handleMaterial != null && this.handleMaterial.equals(other.handleMaterial)) &&
                (this.weight == other.weight)) {
                    System.out.println("Both scissorss are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Scissors [bladeLength=" + bladeLength + ", handleMaterial=" + handleMaterial + ", weight=" + weight + "]";
    }
    @Override
    public int hashCode(){
        return 34;
    }
}
