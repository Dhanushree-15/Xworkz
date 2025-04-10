package com.xworkz.Lesson;

public class Camera {
    private int resolution;
    private String brand;
    private double price;

    public Camera(int resolution, String brand, double price) {
        this.resolution = resolution;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Camera [resolution=" + resolution + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 87;
    }
}
