package com.xworkz.Lesson;

public class Binoculars {
    private int zoomLevel;
    private String brand;
    private double weight;

    public Binoculars(int zoomLevel, String brand, double weight) {
        this.zoomLevel = zoomLevel;
        this.brand = brand;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Binoculars [zoomLevel=" + zoomLevel + ", brand=" + brand + ", weight=" + weight + "]";
    }

    @Override
    public int hashCode() {
        return 95;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Binoculars) {
                System.out.println("ref is Binoculars, will compare...");
                Binoculars b1 = this;
                Binoculars b2 = (Binoculars) obj;

                if (b1.zoomLevel == b2.zoomLevel &&
                        b1.weight == b2.weight &&
                        (b1.brand != null && b1.brand.equals(b2.brand))) {

                    System.out.println("both binoculars are same");
                    return true;
                }
            }
        }
        return false;
    }
}
