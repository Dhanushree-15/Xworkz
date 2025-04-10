package com.xworkz.Lesson;

public class Pan {
    private int diameter;
    private String material;
    private double price;

    public Pan(int diameter, String material, double price) {
        this.diameter = diameter;
        this.material = material;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Pan [diameter=" + diameter + ", material=" + material + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 42;
    }
}
