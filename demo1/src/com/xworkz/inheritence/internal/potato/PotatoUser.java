package com.xworkz.inheritence.internal.potato;

public class PotatoUser {
    public void use(Potato potato) {
        potato.grow();
        potato.cook();
        potato.carbs();
        potato.types();
        potato.staple();

        if (potato instanceof SweetPotato) {
            System.out.println("Potato is an instance of SweetPotato");
            SweetPotato sweet = (SweetPotato) potato;
            sweet.vitaminA();
        }
    }
}
