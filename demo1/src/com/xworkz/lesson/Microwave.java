package com.xworkz.lesson;

public class Microwave {
    private int powerWatts;
    private String brand;
    private double capacityLitres;

    public Microwave(int powerWatts, String brand, double capacityLitres) {
        this.powerWatts = powerWatts;
        this.brand = brand;
        this.capacityLitres = capacityLitres;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Microwave) {
                System.out.println("Ref is Microwave, will compare...");
                Microwave other = (Microwave) obj;
                if ((this.powerWatts == other.powerWatts) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.capacityLitres == other.capacityLitres)) {
                    System.out.println("Both microwaves are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Microwave [powerWatts=" + powerWatts + ", brand=" + brand + ", capacityLitres=" + capacityLitres + "]";
    }
    @Override
    public int hashCode(){
        return 49;
    }
}
