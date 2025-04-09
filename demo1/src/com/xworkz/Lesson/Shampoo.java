package com.xworkz.Lesson;

public class Shampoo {
    private int quantityInML;
    private String brand;
    private double price;

    public Shampoo(int quantityInML, String brand, double price) {
        this.quantityInML = quantityInML;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Shampoo [quantityInML=" + quantityInML + ", brand=" + brand + ", price=" + price + "]";
    }
}
