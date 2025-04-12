package com.xworkz.Lesson;

public class Blender {
    private int speedLevels;
    private String brand;
    private double capacity;

    public Blender(int speedLevels, String brand, double capacity) {
        this.speedLevels = speedLevels;
        this.brand = brand;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Blender [speedLevels=" + speedLevels + ", brand=" + brand + ", capacity=" + capacity + "]";
    }

    @Override
    public int hashCode() {
        return 94;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Blender) {
                System.out.println("ref is Blender, will compare...");
                Blender b1 = this;
                Blender b2 = (Blender) obj;

                if (b1.speedLevels == b2.speedLevels &&
                        b1.capacity == b2.capacity &&
                        (b1.brand != null && b1.brand.equals(b2.brand))) {

                    System.out.println("both blenders are same");
                    return true;
                }
            }
        }
        return false;
    }
}
