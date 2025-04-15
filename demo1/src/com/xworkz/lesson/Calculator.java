package com.xworkz.lesson;

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
    public int hashCode() {
        return 88;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Calculator) {
                System.out.println("ref is Calculator, will compare...");
                Calculator c1 = this;
                Calculator c2 = (Calculator) obj;

                if (c1.numberOfButtons == c2.numberOfButtons &&
                        c1.price == c2.price &&
                        (c1.brand != null && c1.brand.equals(c2.brand))) {

                    System.out.println("both calculators are same");
                    return true;
                }
            }
        }
        return false;
    }
}
