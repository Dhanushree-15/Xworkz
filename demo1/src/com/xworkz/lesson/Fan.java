package com.xworkz.lesson;

public class Fan {
    private int speedLevels;
    private String brand;
    private double powerConsumption;

    public Fan(int speedLevels, String brand, double powerConsumption) {
        this.speedLevels = speedLevels;
        this.brand = brand;
        this.powerConsumption = powerConsumption;
    }
    @Override
    public String toString() {
        return "Fan [speedLevels=" + speedLevels + ", brand=" + brand + ", powerConsumption=" + powerConsumption + "]";
    }

    @Override
    public int hashCode() {
        return 73;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Fan) {
                System.out.println("ref is Fan, will compare...");
                Fan f1 = this;
                Fan f2 = (Fan) obj;

                if (f1.speedLevels == f2.speedLevels &&
                        f1.powerConsumption == f2.powerConsumption &&
                        (f1.brand != null && f1.brand.equals(f2.brand))) {

                    System.out.println("both fans are same");
                    return true;
                }
            }
        }
        return false;
    }
}
