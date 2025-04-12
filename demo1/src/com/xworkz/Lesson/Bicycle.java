package com.xworkz.Lesson;

public class Bicycle {
    private int gearCount;
    private String brand;
    private double wheelSize;

    public Bicycle(int gearCount, String brand, double wheelSize) {
        this.gearCount = gearCount;
        this.brand = brand;
        this.wheelSize = wheelSize;
    }

    @Override
    public String toString() {
        return "Bicycle [gearCount=" + gearCount + ", brand=" + brand + ", wheelSize=" + wheelSize + "]";
    }

    @Override
    public int hashCode() {
        return 96;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Bicycle) {
                System.out.println("ref is Bicycle, will compare...");
                Bicycle b1 = this;
                Bicycle b2 = (Bicycle) obj;

                if (b1.gearCount == b2.gearCount &&
                        b1.wheelSize == b2.wheelSize &&
                        (b1.brand != null && b1.brand.equals(b2.brand))) {

                    System.out.println("both bicycles are same");
                    return true;
                }
            }
        }
        return false;
    }
}
