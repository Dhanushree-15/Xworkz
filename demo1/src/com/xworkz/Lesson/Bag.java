package com.xworkz.Lesson;

public class Bag {
    private int bagId;
    private String bagType;
    private double price;

    public Bag(int bagId, String bagType, double price) {
        this.bagId = bagId;
        this.bagType = bagType;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Bag [bagId=" + bagId + ", bagType=" + bagType + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        return 98;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Bag) {
                System.out.println("ref is Bag, will compare...");
                Bag b1 = this;
                Bag b2 = (Bag) obj;

                if (b1.bagId == b2.bagId &&
                        b1.price == b2.price &&
                        (b1.bagType != null && b1.bagType.equals(b2.bagType))) {

                    System.out.println("both bags are same");
                    return true;
                }
            }
        }
        return false;
    }
}
