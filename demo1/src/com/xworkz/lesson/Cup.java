package com.xworkz.lesson;

public class Cup {
    private int capacityInMl;
    private String material;
    private double price;

    public Cup(int capacityInMl, String material, double price) {
        this.capacityInMl = capacityInMl;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cup [capacityInMl=" + capacityInMl + ", material=" + material + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        return 76;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Cup) {
                System.out.println("ref is Cup, will compare...");
                Cup c1 = this;
                Cup c2 = (Cup) obj;

                if (c1.capacityInMl == c2.capacityInMl &&
                        c1.price == c2.price &&
                        (c1.material != null && c1.material.equals(c2.material))) {

                    System.out.println("both cups are same");
                    return true;
                }
            }
        }
        return false;
    }
}
