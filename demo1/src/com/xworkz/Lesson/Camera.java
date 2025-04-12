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
    public int hashCode() {
        return 87;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Camera) {
                System.out.println("ref is Camera, will compare...");
                Camera c1 = this;
                Camera c2 = (Camera) obj;

                if (c1.resolution == c2.resolution &&
                        c1.price == c2.price &&
                        (c1.brand != null && c1.brand.equals(c2.brand))) {

                    System.out.println("both cameras are same");
                    return true;
                }
            }
        }
        return false;
    }
}
