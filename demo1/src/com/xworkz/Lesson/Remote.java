package com.xworkz.Lesson;

public class Remote {
    private int buttons;
    private String brand;
    private double range;

    public Remote(int buttons, String brand, double range) {
        this.buttons = buttons;
        this.brand = brand;
        this.range = range;
    }

    @Override
    public String toString() {
        return "Remote [buttons=" + buttons + ", brand=" + brand + ", range=" + range + "]";
    }
    @Override
    public int hashCode(){
        return 37;
    }
}
