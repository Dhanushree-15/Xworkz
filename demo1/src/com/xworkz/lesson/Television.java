package com.xworkz.lesson;

public class Television {
    private int screenSizeInInches;
    private String brand;
    private double price;

    public Television(int screenSizeInInches, String brand, double price) {
        this.screenSizeInInches = screenSizeInInches;
        this.brand = brand;
        this.price = price;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Television) {
                System.out.println("Ref is Television, will compare...");
                Television other = (Television) obj;
                if ((this.screenSizeInInches == other.screenSizeInInches) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.price == other.price)) {
                    System.out.println("Both televisions are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Television [screenSizeInInches=" + screenSizeInInches + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 20;
    }
}
