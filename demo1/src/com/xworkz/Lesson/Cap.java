package com.xworkz.Lesson;

public class Cap {
    private int size;
    private String color;
    private double price;

    public Cap(int size, String color, double price) {
        this.size = size;
        this.color = color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cap [size=" + size + ", color=" + color + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        return 84;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Cap) {
                System.out.println("ref is Cap, will compare...");
                Cap c1 = this;
                Cap c2 = (Cap) obj;

                if (c1.size == c2.size &&
                        c1.price == c2.price &&
                        (c1.color != null && c1.color.equals(c2.color))) {

                    System.out.println("both caps are same");
                    return true;
                }
            }
        }
        return false;
    }
}
