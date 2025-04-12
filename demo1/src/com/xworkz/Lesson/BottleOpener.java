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
    public int hashCode() {
        return 91;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof BottleOpener) {
                System.out.println("ref is BottleOpener, will compare...");
                BottleOpener b1 = this;
                BottleOpener b2 = (BottleOpener) obj;

                if (b1.durability == b2.durability &&
                        b1.weight == b2.weight &&
                        (b1.handleMaterial != null && b1.handleMaterial.equals(b2.handleMaterial))) {

                    System.out.println("both bottle openers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
