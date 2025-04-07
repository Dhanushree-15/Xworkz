package com.xworkz.inheritence.internal.redbangles;

public class BanglesUser {
    public void use(RedBangles bangles) {
        bangles.wear();
        bangles.material();
        bangles.tradition();
        bangles.design();
        bangles.symbol();

        if (bangles instanceof GoldBangles) {
            System.out.println("bangles is instance of GoldBangles");
            GoldBangles gold = (GoldBangles) bangles;
            gold.polish();
        }
    }
}
