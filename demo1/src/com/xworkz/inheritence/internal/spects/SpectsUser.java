package com.xworkz.inheritence.internal.spects;

public class SpectsUser {
    public void use(Spects spects) {
        spects.vision();
        spects.lenses();
        spects.frame();
        spects.protect();
        spects.customize();

        if (spects instanceof Sunglasses) {
            System.out.println("spects is instance of Sunglasses");
            Sunglasses sunglasses = (Sunglasses) spects;
            sunglasses.polarizedView();
        }
    }
}
