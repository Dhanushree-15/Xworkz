package com.xworkz.Lesson;

public class Carpet {
    private int length;
    private String material;
    private double price;

    public Carpet(int length, String material, double price) {
        this.length = length;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Carpet [length=" + length + ", material=" + material + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        return 82;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Carpet) {
                System.out.println("ref is Carpet, will compare...");
                Carpet carpet1 = this;
                Carpet carpet2 = (Carpet) obj;

                if (carpet1.length == carpet2.length &&
                        carpet1.price == carpet2.price &&
                        (carpet1.material != null && carpet1.material.equals(carpet2.material))) {

                    System.out.println("both carpets are same");
                    return true;
                }
            }
        }
        return false;
    }
}
