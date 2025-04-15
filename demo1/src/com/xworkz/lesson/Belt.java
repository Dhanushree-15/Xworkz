package com.xworkz.lesson;

public class Belt {
    private int beltId;
    private String material;
    private double length;

    public Belt(int beltId, String material, double length) {
        this.beltId = beltId;
        this.material = material;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Belt [beltId=" + beltId + ", material=" + material + ", length=" + length + "]";
    }

    @Override
    public int hashCode() {
        return 97;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Belt) {
                System.out.println("ref is Belt, will compare...");
                Belt b1 = this;
                Belt b2 = (Belt) obj;

                if (b1.beltId == b2.beltId &&
                        b1.length == b2.length &&
                        (b1.material != null && b1.material.equals(b2.material))) {

                    System.out.println("both belts are same");
                    return true;
                }
            }
        }
        return false;
    }
}
