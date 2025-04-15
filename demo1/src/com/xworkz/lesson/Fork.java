package com.xworkz.lesson;

public class Fork {
    private int prongCount;
    private String material;
    private double length;

    public Fork(int prongCount, String material, double length) {
        this.prongCount = prongCount;
        this.material = material;
        this.length = length;
    }
    @Override
    public String toString() {
        return "Fork [prongCount=" + prongCount + ", material=" + material + ", length=" + length + "]";
    }

    @Override
    public int hashCode() {
        return 72;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Fork) {
                System.out.println("ref is Fork, will compare...");
                Fork f1 = this;
                Fork f2 = (Fork) obj;

                if (f1.prongCount == f2.prongCount &&
                        f1.length == f2.length &&
                        (f1.material != null && f1.material.equals(f2.material))) {

                    System.out.println("both forks are same");
                    return true;
                }
            }
        }
        return false;
    }
}
