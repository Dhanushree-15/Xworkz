package com.xworkz.lesson;

public class Rope {
    private int length;
    private String material;
    private double thickness;

    public Rope(int length, String material, double thickness) {
        this.length = length;
        this.material = material;
        this.thickness = thickness;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Rope) {
                System.out.println("Ref is Rope, will compare...");
                Rope other = (Rope) obj;
                if ((this.length == other.length) &&
                (this.material != null && this.material.equals(other.material)) &&
                (this.thickness == other.thickness)) {
                    System.out.println("Both ropes are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Rope [length=" + length + ", material=" + material + ", thickness=" + thickness + "]";
    }
    @Override
    public int hashCode(){
        return 36;
    }
}
