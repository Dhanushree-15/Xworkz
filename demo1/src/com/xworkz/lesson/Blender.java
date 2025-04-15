package com.xworkz.lesson;

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
        return "Blender [speedLevels=" + speedLevels + ", brand=" + brand + ", capacity=" + capacity+"]";
    }
    
    @Override
    public int hashCode() {
        return 94;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Blender) {
                System.out.println("Ref is Blender, will compare...");
                Blender other = (Blender) obj;
                if ((this.speedLevels == other.speedLevels) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.capacity == other.capacity)) {
                    System.out.println("Both blenders are same");
                    return true;
                }
            }
        }
        return false;
    }

}
