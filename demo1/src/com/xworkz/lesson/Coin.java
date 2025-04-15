package com.xworkz.lesson;

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

    @Override
    public int hashCode() {
        return 78;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Coin) {
                System.out.println("ref is Coin, will compare...");
                Coin c1 = this;
                Coin c2 = (Coin) obj;

                if (c1.year == c2.year &&
                        c1.diameter == c2.diameter &&
                        (c1.currency != null && c1.currency.equals(c2.currency))) {

                    System.out.println("both coins are same");
                    return true;
                }
            }
        }
        return false;
    }
}
