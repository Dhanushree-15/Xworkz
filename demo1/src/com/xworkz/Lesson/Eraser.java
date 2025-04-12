package com.xworkz.Lesson;

public class Eraser {
    private int lengthInCm;
    private String brand;
    private double price;

    public Eraser(int lengthInCm, String brand, double price) {
        this.lengthInCm = lengthInCm;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Eraser [lengthInCm=" + lengthInCm + ", brand=" + brand + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        return 74;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Eraser) {
                System.out.println("ref is Eraser, will compare...");
                Eraser e1 = this;
                Eraser e2 = (Eraser) obj;

                if (e1.lengthInCm == e2.lengthInCm &&
                        e1.price == e2.price &&
                        (e1.brand != null && e1.brand.equals(e2.brand))) {

                    System.out.println("both erasers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
