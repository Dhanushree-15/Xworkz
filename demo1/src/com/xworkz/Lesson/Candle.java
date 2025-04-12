package com.xworkz.Lesson;

public class Candle {
    private int height;
    private String color;
    private double burnTime;

    public Candle(int height, String color, double burnTime) {
        this.height = height;
        this.color = color;
        this.burnTime = burnTime;
    }

    @Override
    public String toString() {
        return "Candle [height=" + height + ", color=" + color + ", burnTime=" + burnTime + "]";
    }

    @Override
    public int hashCode() {
        return 85;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Candle) {
                System.out.println("ref is Candle, will compare...");
                Candle c1 = this;
                Candle c2 = (Candle) obj;

                if (c1.height == c2.height &&
                        c1.burnTime == c2.burnTime &&
                        (c1.color != null && c1.color.equals(c2.color))) {

                    System.out.println("both candles are same");
                    return true;
                }
            }
        }
        return false;
    }
}
