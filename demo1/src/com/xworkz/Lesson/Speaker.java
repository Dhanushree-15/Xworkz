package com.xworkz.Lesson;

public class Speaker {
    private int volumeLevel;
    private String brand;
    private double price;

    public Speaker(int volumeLevel, String brand, double price) {
        this.volumeLevel = volumeLevel;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Speaker [volumeLevel=" + volumeLevel + ", brand=" + brand + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 24;
    }
}
