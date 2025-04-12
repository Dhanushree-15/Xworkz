package com.xworkz.Lesson;

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
        return "Blanket [thickness=" + thickness + ", material=" + material + ", length=" + length + "]";
    }

    @Override
    public int hashCode() {
        return 94;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Blanket) {
                System.out.println("ref is Blanket, will compare...");
                Blanket b1 = this;
                Blanket b2 = (Blanket) obj;

                if (b1.thickness == b2.thickness &&
                        b1.length == b2.length &&
                        (b1.material != null && b1.material.equals(b2.material))) {

                    System.out.println("both blankets are same");
                    return true;
                }
            }
        }
        return false;
    }
}
