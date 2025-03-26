package com.xworkz.Inbox;

public class BankAccount1 {
    private double balance;

    public BankAccount1(double initialBalance) {
        if (initialBalance > 0) {
            this.balance = initialBalance;
        }
    }


    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
}


