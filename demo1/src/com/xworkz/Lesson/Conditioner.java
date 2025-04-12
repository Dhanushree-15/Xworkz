package com.xworkz.Lesson;

public class Conditioner {
    private int volumeInMl;
    private String fragrance;
    private double price;

    public Conditioner(int volumeInMl, String fragrance, double price) {
        this.volumeInMl = volumeInMl;
        this.fragrance = fragrance;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Conditioner [volumeInMl=" + volumeInMl + ", fragrance=" + fragrance + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        return 75;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Conditioner) {
                System.out.println("ref is Conditioner, will compare...");
                Conditioner c1 = this;
                Conditioner c2 = (Conditioner) obj;

                if (c1.volumeInMl == c2.volumeInMl &&
                        c1.price == c2.price &&
                        (c1.fragrance != null && c1.fragrance.equals(c2.fragrance))) {

                    System.out.println("both conditioners are same");
                    return true;
                }
            }
        }
        return false;
    }
}
