package com.xworkz.Lesson;

public class Calculator {
    private int numberOfButtons;
    private String brand;
    private double price;

    public Calculator(int numberOfButtons, String brand, double price) {
        this.numberOfButtons = numberOfButtons;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Calculator [numberOfButtons=" + numberOfButtons + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 88;
    }
}
