package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.money.Currency;
import com.xworkz.inheritence.internal.money.Dollar;

public class MoneyRunner {
    public static void main(String[] args) {
        Currency currency1 = new Currency();
        currency1.value();
        currency1.rate();
        currency1.symbol();
        currency1.usage();

        System.out.println("-----------");

        Currency currency = new Dollar();
        currency.value();
        currency.rate();
        currency.symbol();
        currency.usage();

        System.out.println("-----------");

        Dollar dollar = new Dollar();
        dollar.value();
        dollar.rate();
        dollar.symbol();
        dollar.usage();
    }
}
