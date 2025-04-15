package com.xworkz.lesson;

public class Comb {
    private int teethCount;
    private String material;
    private double length;

    public Comb(int teethCount, String material, double length) {
        this.teethCount = teethCount;
        this.material = material;
        this.length = length;
    }

    

    @Override
    public String toString() {
        return "Comb [teethCount=" + teethCount + ", material=" + material + ", length=" + length + "]";
    }

    @Override
    public int hashCode() {
        return 77;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Comb) {
                System.out.println("ref is Comb, will compare...");
                Comb c1 = this;
                Comb c2 = (Comb) obj;

                if (c1.teethCount == c2.teethCount &&
                        c1.length == c2.length &&
                        (c1.material != null && c1.material.equals(c2.material))) {

                    System.out.println("both combs are same");
                    return true;
                }
            }
        }
        return false;
    }
}
