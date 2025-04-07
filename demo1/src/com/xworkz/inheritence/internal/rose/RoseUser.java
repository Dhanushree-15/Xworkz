package com.xworkz.inheritence.internal.rose;

public class RoseUser {
    public void use(Rose rose) {
        rose.fragrance();
        rose.colors();
        rose.decorate();
        rose.thorns();
        rose.love();

        if (rose instanceof RedRose) {
            System.out.println("rose is instance of RedRose");
            RedRose red = (RedRose) rose;
            red.romanticValue();
        }
    }
}
