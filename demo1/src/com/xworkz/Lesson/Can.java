package com.xworkz.Lesson;

public class Can {
    private int capacity;
    private String material;
    private double price;

    public Can(int capacity, String material, double price) {
        this.capacity = capacity;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Can [capacity=" + capacity + ", material=" + material + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        return 86;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Can) {
                System.out.println("ref is Can, will compare...");
                Can c1 = this;
                Can c2 = (Can) obj;

                if (c1.capacity == c2.capacity &&
                        c1.price == c2.price &&
                        (c1.material != null && c1.material.equals(c2.material))) {

                    System.out.println("both cans are same");
                    return true;
                }
            }
        }
        return false;
    }
}
