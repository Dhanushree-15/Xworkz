package com.xworkz.lesson;

public class Charger {
    private int wattage;
    private String brand;
    private double voltage;

    public Charger(int wattage, String brand, double voltage) {
        this.wattage = wattage;
        this.brand = brand;
        this.voltage = voltage;
    }

    

    @Override
    public String toString() {
        return "Charger [wattage=" + wattage + ", brand=" + brand + ", voltage=" + voltage + "]";
    }

    @Override
    public int hashCode() {
        return 80;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Charger) {
                System.out.println("ref is Charger, will compare...");
                Charger c1 = this;
                Charger c2 = (Charger) obj;

                if (c1.wattage == c2.wattage &&
                        c1.voltage == c2.voltage &&
                        (c1.brand != null && c1.brand.equals(c2.brand))) {

                    System.out.println("both chargers are same");
                    return true;
                }
            }
        }
        return false;
    }
}
