package com.xworkz.lesson;

public class Door {
    private int heightInInches;
    private String material;
    private double price;

    public Door(int heightInInches, String material, double price) {
        this.heightInInches = heightInInches;
        this.material = material;
        this.price = price;
    }


    @Override
    public String toString() {
        return "Door [heightInInches=" + heightInInches + ", material=" + material + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        return 75;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Door) {
                System.out.println("ref is Door, will compare...");
                Door d1 = this;
                Door d2 = (Door) obj;

                if (d1.heightInInches == d2.heightInInches &&
                        d1.price == d2.price &&
                        (d1.material != null && d1.material.equals(d2.material))) {

                    System.out.println("both doors are same");
                    return true;
                }
            }
        }
        return false;
    }
}
