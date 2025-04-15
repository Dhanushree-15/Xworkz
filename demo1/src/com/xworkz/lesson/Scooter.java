package com.xworkz.lesson;

public class Scooter {
    private int engineCC;
    private String brand;
    private double mileage;

    public Scooter(int engineCC, String brand, double mileage) {
        this.engineCC = engineCC;
        this.brand = brand;
        this.mileage = mileage;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Scooter) {
                System.out.println("Ref is Scooter, will compare...");
                Scooter other = (Scooter) obj;
                if ((this.engineCC == other.engineCC) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.mileage == other.mileage)) {
                    System.out.println("Both scooters are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Scooter [engineCC=" + engineCC + ", brand=" + brand + ", mileage=" + mileage + "]";
    }
    @Override
    public int hashCode(){
        return 33;
    }
}
