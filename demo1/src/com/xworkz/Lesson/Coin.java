package com.xworkz.Lesson;

public class Coin {
    private int year;
    private String currency;
    private double diameter;

    public Coin(int year, String currency, double diameter) {
        this.year = year;
        this.currency = currency;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Coin [year=" + year + ", currency=" + currency + ", diameter=" + diameter + "]";
    }
}
