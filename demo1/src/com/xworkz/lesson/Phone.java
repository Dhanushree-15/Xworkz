package com.xworkz.lesson;

public class Phone {
    private int modelNumber;
    private String brand;
    private double price;

    public Phone(int modelNumber, String brand, double price) {
        this.modelNumber = modelNumber;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Phone) {
                System.out.println("Ref is Phone, will compare...");
                Phone other = (Phone) obj;
                if ((this.modelNumber == other.modelNumber) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.price == other.price)) {
                    System.out.println("Both phones are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Phone [modelNumber=" + modelNumber + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 39;
    }
}
