package com.xworkz.lesson;

public class Car {
    private int modelYear;
    private String brand;
    private double price;

    public Car(int modelYear, String brand, double price) {
        this.modelYear = modelYear;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car [modelYear=" + modelYear + ", brand=" + brand + ", price=" + price + "]";
    }

    @Override
    public int hashCode() {
        return 83;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Car) {
                System.out.println("ref is Car, will compare...");
                Car car1 = this;
                Car car2 = (Car) obj;

                if (car1.modelYear == car2.modelYear &&
                        car1.price == car2.price &&
                        (car1.brand != null && car1.brand.equals(car2.brand))) {

                    System.out.println("both cars are same");
                    return true;
                }
            }
        }
        return false;
    }
}
