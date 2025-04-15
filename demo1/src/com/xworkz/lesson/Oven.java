package com.xworkz.lesson;

public class Oven {
    private int capacity;
    private String brand;
    private double power;

    public Oven(int capacity, String brand, double power) {
        this.capacity = capacity;
        this.brand = brand;
        this.power = power;
    }


    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Oven) {
                System.out.println("Ref is Oven, will compare...");
                Oven other = (Oven) obj;
                if ((this.capacity == other.capacity) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.power == other.power)) {
                    System.out.println("Both ovens are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Oven [capacity=" + capacity + ", brand=" + brand + ", power=" + power + "]";
    }
    @Override
    public int hashCode(){
        return 43;
    }
}
