package com.xworkz.Lesson;

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
    public String toString() {
        return "Mirror [heightCm=" + heightCm + ", shape=" + shape + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 48;
    }
}
