package com.xworkz.lesson;

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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Speaker) {
                System.out.println("Ref is Speaker, will compare...");
                Speaker other = (Speaker) obj;
                if ((this.volumeLevel == other.volumeLevel) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.price == other.price)) {
                    System.out.println("Both speakers are same");
                    return true;
                }
            }
        }
        return false;
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
