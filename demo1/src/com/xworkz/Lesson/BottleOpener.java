package com.xworkz.Lesson;

public class BottleOpener {
    private int durability;
    private String handleMaterial;
    private double weight;

    public BottleOpener(int durability, String handleMaterial, double weight) {
        this.durability = durability;
        this.handleMaterial = handleMaterial;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "BottleOpener [durability=" + durability + ", handleMaterial=" + handleMaterial + ", weight=" + weight + "]";
    }
    @Override
    public int hashCode(){
        return 91;
    }
}
