package com.xworkz.Inbox;

public class BankAccountRunner {
    public static void main(String[] args) {
        BankAccount1 account = new BankAccount1(1000);
        account.deposit(500);
        account.withdraw(200);
        System.out.println("Current Balance: " + account.getBalance());
    }
}
