package com.xworkz.Lesson;

public class Bowl {
    private int capacityInMl;
    private String material;
    private double diameter;

    public Bowl(int capacityInMl, String material, double diameter) {
        this.capacityInMl = capacityInMl;
        this.material = material;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Bowl [capacityInMl=" + capacityInMl + ", material=" + material + ", diameter=" + diameter + "]";
    }

    @Override
    public int hashCode() {
        return 90;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Bowl) {
                System.out.println("ref is Bowl, will compare...");
                Bowl b1 = this;
                Bowl b2 = (Bowl) obj;

                if (b1.capacityInMl == b2.capacityInMl &&
                        b1.diameter == b2.diameter &&
                        (b1.material != null && b1.material.equals(b2.material))) {

                    System.out.println("both bowls are same");
                    return true;
                }
            }
        }
        return false;
    }
}
