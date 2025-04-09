package com.xworkz.Lesson;

public class Notebook {
    private int totalPages;
    private String brand;
    private double cost;

    public Notebook(int totalPages, String brand, double cost) {
        this.totalPages = totalPages;
        this.brand = brand;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Notebook [totalPages=" + totalPages + ", brand=" + brand + ", cost=" + cost + "]";
    }
}
