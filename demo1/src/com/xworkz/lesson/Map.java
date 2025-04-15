package com.xworkz.lesson;

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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Map) {
                System.out.println("Ref is Map, will compare...");
                Map other = (Map) obj;
                if ((this.scale == other.scale) &&
                (this.region != null && this.region.equals(other.region)) &&
                (this.price == other.price)) {
                    System.out.println("Both maps are same");
                    return true;
                }
            }
        }
        return false;
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
