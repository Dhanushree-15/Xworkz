package com.xworkz.lesson;

public class Bottle {
    private int volumeInMl;
    private String material;
    private double height;

    public Bottle(int volumeInMl, String material, double height) {
        this.volumeInMl = volumeInMl;
        this.material = material;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Bottle [volumeInMl=" + volumeInMl + ", material=" + material + ", height=" + height + "]";
    }

    @Override
    public int hashCode() {
        return 92;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Bottle) {
                System.out.println("ref is Bottle, will compare...");
                Bottle b1 = this;
                Bottle b2 = (Bottle) obj;

                if (b1.volumeInMl == b2.volumeInMl &&
                        b1.height == b2.height &&
                        (b1.material != null && b1.material.equals(b2.material))) {

                    System.out.println("both bottles are same");
                    return true;
                }
            }
        }
        return false;
    }
}
