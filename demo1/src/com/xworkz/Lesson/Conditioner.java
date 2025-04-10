package com.xworkz.Lesson;

public class Conditioner {
    private int volumeInMl;
    private String fragrance;
    private double price;

    public Conditioner(int volumeInMl, String fragrance, double price) {
        this.volumeInMl = volumeInMl;
        this.fragrance = fragrance;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Conditioner [volumeInMl=" + volumeInMl + ", fragrance=" + fragrance + ", price=" + price + "]";
    }
    @Override
    public int hashCode(){
        return 75;
    }
}
