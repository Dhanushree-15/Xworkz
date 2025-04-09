package com.xworkz.Lesson;

public class Mouse {
    private int dpi;
    private String brand;
    private double price;

    public Mouse(int dpi, String brand, double price) {
        this.dpi = dpi;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Mouse [dpi=" + dpi + ", brand=" + brand + ", price=" + price + "]";
    }
}
