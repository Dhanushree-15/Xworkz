package com.xworkz.Lesson;

public class Map {
    private int scale;
    private String region;
    private double price;

    public Map(int scale, String region, double price) {
        this.scale = scale;
        this.region = region;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Map [scale=" + scale + ", region=" + region + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 52;
    }
}
