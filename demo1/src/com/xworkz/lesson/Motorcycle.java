package com.xworkz.lesson;

public class Motorcycle {
    private int engineCapacity;
    private String brand;
    private double price;

    public Motorcycle(int engineCapacity, String brand, double price) {
        this.engineCapacity = engineCapacity;
        this.brand = brand;
        this.price = price;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Motorcycle) {
                System.out.println("Ref is Motorcycle, will compare...");
                Motorcycle other = (Motorcycle) obj;
                if ((this.engineCapacity == other.engineCapacity) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.price == other.price)) {
                    System.out.println("Both motorcycles are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Motorcycle [engineCapacity=" + engineCapacity + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 46;
    }
}
