package com.xworkz.lesson;

public class Ruler {
    private int length;
    private String material;
    private double width;

    public Ruler(int length, String material, double width) {
        this.length = length;
        this.material = material;
        this.width = width;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Ruler) {
                System.out.println("Ref is Ruler, will compare...");
                Ruler other = (Ruler) obj;
                if ((this.length == other.length) &&
                (this.material != null && this.material.equals(other.material)) &&
                (this.width == other.width)) {
                    System.out.println("Both rulers are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Ruler [length=" + length + ", material=" + material + ", width=" + width + "]";
    }
    @Override
    public int hashCode(){
        return 35;
    }
}
