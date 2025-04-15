package com.xworkz.lesson;

public class Blanket {
    private int thickness;
    private String material;
    private double length;

    public Blanket(int thickness, String material, double length) {
        this.thickness = thickness;
        this.material = material;
        this.length = length;
    }

    
    @Override
    public String toString() {
        return "Blanket [thickness=" + thickness + ", material=" + material + ", length=" + length +"]";
    }
    
    @Override
    public int hashCode() {
        return 94;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Blanket) {
                System.out.println("Ref is Blanket, will compare...");
                Blanket other = (Blanket) obj;
                if ((this.thickness == other.thickness) &&
                (this.material != null && this.material.equals(other.material)) &&
                (this.length == other.length)) {
                    System.out.println("Both blankets are same");
                    return true;
                }
            }
        }
        return false;
    }
}
