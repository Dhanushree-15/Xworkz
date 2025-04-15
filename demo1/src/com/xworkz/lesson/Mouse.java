package com.xworkz.lesson;

public class Mouse {
    private int dpi;
    private String brand;
    private double price;

    public Mouse(int dpi, String brand, double price) {
        this.dpi = dpi;
        this.brand = brand;
        this.price = price;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Mouse) {
                System.out.println("Ref is Mouse, will compare...");
                Mouse other = (Mouse) obj;
                if ((this.dpi == other.dpi) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.price == other.price)) {
                    System.out.println("Both mouses are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Mouse [dpi=" + dpi + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 45;
    }
}
