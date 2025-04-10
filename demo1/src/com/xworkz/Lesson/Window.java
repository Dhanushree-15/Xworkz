package com.xworkz.Lesson;

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
    public String toString() {
        return "Window [height=" + height + ", material=" + material + ", width=" + width + "]";
    }
    @Override
    public int hashCode(){
        return 10;
    }
}
