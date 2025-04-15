package com.xworkz.lesson;

public class Mirror {
    private int heightCm;
    private String shape;
    private double price;

    public Mirror(int heightCm, String shape, double price) {
        this.heightCm = heightCm;
        this.shape = shape;
        this.price = price;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Mirror) {
                System.out.println("Ref is Mirror, will compare...");
                Mirror other = (Mirror) obj;
                if ((this.heightCm == other.heightCm) &&
                (this.shape != null && this.shape.equals(other.shape)) &&
                (this.price == other.price)) {
                    System.out.println("Both mirrors are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Mirror [heightCm=" + heightCm + ", shape=" + shape + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 48;
    }
}
