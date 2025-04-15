package com.xworkz.lesson;

public class Watch {
    private int warrantyYears;      // Warranty period in years
    private String brand;           // Brand of the watch
    private double price;           // Price of the watch

    public Watch(int warrantyYears, String brand, double price) {
        this.warrantyYears = warrantyYears;
        this.brand = brand;
        this.price = price;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Watch) {
                System.out.println("Ref is Watch, will compare...");
                Watch other = (Watch) obj;
                if ((this.warrantyYears == other.warrantyYears) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.price == other.price)) {
                    System.out.println("Both watchs are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Watch [warrantyYears=" + warrantyYears + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 11;
    }
}
