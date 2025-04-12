package com.xworkz.Lesson;

public class Clock {
    private int hourFormat;
    private String brand;
    private double diameter;

    public Clock(int hourFormat, String brand, double diameter) {
        this.hourFormat = hourFormat;
        this.brand = brand;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Clock [hourFormat=" + hourFormat + ", brand=" + brand + ", diameter=" + diameter + "]";
    }

    @Override
    public int hashCode() {
        return 79;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Clock) {
                System.out.println("ref is Clock, will compare...");
                Clock c1 = this;
                Clock c2 = (Clock) obj;

                if (c1.hourFormat == c2.hourFormat &&
                        c1.diameter == c2.diameter &&
                        (c1.brand != null && c1.brand.equals(c2.brand))) {

                    System.out.println("both clocks are same");
                    return true;
                }
            }
        }
        return false;
    }
}
