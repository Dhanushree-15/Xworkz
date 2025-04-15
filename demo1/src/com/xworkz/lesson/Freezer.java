package com.xworkz.lesson;

public class Freezer {
    private int capacityInLiters;
    private String brand;
    private double temperatureSetting;

    public Freezer(int capacityInLiters, String brand, double temperatureSetting) {
        this.capacityInLiters = capacityInLiters;
        this.brand = brand;
        this.temperatureSetting = temperatureSetting;
    }
    @Override
    public String toString() {
        return "Freezer [capacityInLiters=" + capacityInLiters + ", brand=" + brand + ", temperatureSetting=" + temperatureSetting + "]";
    }
    @Override
    public int hashCode(){
        return 71;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Freezer) {
                System.out.println("Ref is Freezer, will compare...");
                Freezer other = (Freezer) obj;
                if ((this.capacityInLiters == other.capacityInLiters) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.temperatureSetting == other.temperatureSetting)) {
                    System.out.println("Both freezers are same");
                    return true;
                }
            }
        }
        return false;
    }

}
