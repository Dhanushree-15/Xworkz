package com.xworkz.inheritence.internal.money;

public class ForexTrader {
    public void use(Currency currency) {
        currency.value();
        currency.rate();
        currency.symbol();
        currency.usage();

        if (currency instanceof Dollar) {
            System.out.println("currency is instance of Dollar");
            Dollar dollar = (Dollar) currency;
            dollar.globalReserve();
        }
    }
}
