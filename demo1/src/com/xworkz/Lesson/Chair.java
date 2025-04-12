package com.xworkz.Lesson;

public class Chair {
    private int legs;
    private String material;
    private double height;

    public Chair(int legs, String material, double height) {
        this.legs = legs;
        this.material = material;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Chair [legs=" + legs + ", material=" + material + ", height=" + height + "]";
    }

    @Override
    public int hashCode() {
        return 81;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Chair) {
                System.out.println("ref is Chair, will compare...");
                Chair chair1 = this;
                Chair chair2 = (Chair) obj;

                if (chair1.legs == chair2.legs &&
                        chair1.height == chair2.height &&
                        (chair1.material != null && chair1.material.equals(chair2.material))) {

                    System.out.println("both chairs are same");
                    return true;
                }
            }
        }
        return false;
    }
}
