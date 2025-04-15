package com.xworkz.lesson;

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
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Wallet) {
                System.out.println("Ref is Wallet, will compare...");
                Wallet other = (Wallet) obj;
                if ((this.numberOfCards == other.numberOfCards) &&
                (this.brand != null && this.brand.equals(other.brand)) &&
                (this.cashAmount == other.cashAmount)) {
                    System.out.println("Both wallets are same");
                    return true;
                }
            }
        }
        return false;
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
