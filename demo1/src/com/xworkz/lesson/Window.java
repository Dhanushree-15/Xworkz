package com.xworkz.lesson;

public class Window {
    private int height;         // Height of the window in cm
    private String material;    // Material used for the window (e.g., wood, aluminum)
    private double width;       // Width of the window in cm

    public Window(int height, String material, double width) {
        this.height = height;
        this.material = material;
        this.width = width;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Window) {
                System.out.println("Ref is Window, will compare...");
                Window other = (Window) obj;
                if ((this.height == other.height) &&
                (this.material != null && this.material.equals(other.material)) &&
                (this.width == other.width)) {
                    System.out.println("Both windows are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Window [height=" + height + ", material=" + material + ", width=" + width + "]";
    }
    @Override
    public int hashCode(){
        return 10;
    }
}
