package com.xworkz.Lesson;

public class Wallet {
    private int numberOfCards;     // Number of cards in the wallet
    private String brand;          // Brand of the wallet
    private double cashAmount;     // Amount of cash in the wallet

    public Wallet(int numberOfCards, String brand, double cashAmount) {
        this.numberOfCards = numberOfCards;
        this.brand = brand;
        this.cashAmount = cashAmount;
    }

    @Override
    public String toString() {
        return "Wallet [numberOfCards=" + numberOfCards + ", brand=" + brand + ", cashAmount=" + cashAmount + "]";
    }
    @Override
    public int hashCode(){
        return 12;
    }
}
