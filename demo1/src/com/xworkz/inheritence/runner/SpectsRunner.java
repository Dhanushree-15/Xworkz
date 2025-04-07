package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.spects.Spects;
import com.xworkz.inheritence.internal.spects.Sunglasses;
import com.xworkz.inheritence.internal.spects.SpectsUser;

public class SpectsRunner {
    public static void main(String[] args) {
        Spects spects = new Spects();
        spects.vision();
        spects.lenses();
        spects.frame();
        spects.protect();
        spects.customize();

        System.out.println("-----------");

        Spects spects2 = new Sunglasses();
        spects2.vision();
        spects2.lenses();
        spects2.frame();
        spects2.protect();
        spects2.customize();

        System.out.println("-----------");

        Sunglasses sunglasses = new Sunglasses();
        sunglasses.vision();
        sunglasses.lenses();
        sunglasses.frame();
        sunglasses.protect();
        sunglasses.customize();
        sunglasses.polarizedView();

        System.out.println("-----------");

        SpectsUser user = new SpectsUser();
        user.use(spects);
        user.use(spects2);
        user.use(sunglasses);
    }
}
