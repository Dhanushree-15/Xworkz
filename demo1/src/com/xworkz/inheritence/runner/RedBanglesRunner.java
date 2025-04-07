package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.redbangles.RedBangles;
import com.xworkz.inheritence.internal.redbangles.GoldBangles;
import com.xworkz.inheritence.internal.redbangles.BanglesUser;

public class RedBanglesRunner {
    public static void main(String[] args) {
        RedBangles redBangles = new RedBangles();
        redBangles.wear();
        redBangles.material();
        redBangles.tradition();
        redBangles.design();
        redBangles.symbol();

        System.out.println("-----------");

        RedBangles goldAsRed = new GoldBangles();
        goldAsRed.wear();
        goldAsRed.material();
        goldAsRed.tradition();
        goldAsRed.design();
        goldAsRed.symbol();

        System.out.println("-----------");

        GoldBangles goldBangles = new GoldBangles();
        goldBangles.wear();
        goldBangles.material();
        goldBangles.tradition();
        goldBangles.design();
        goldBangles.symbol();
        goldBangles.polish();

        System.out.println("-----------");

        BanglesUser user = new BanglesUser();
        user.use(redBangles);
        user.use(goldAsRed);
        user.use(goldBangles);
    }
}
