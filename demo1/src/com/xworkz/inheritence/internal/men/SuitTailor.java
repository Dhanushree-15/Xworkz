package com.xworkz.inheritence.internal.men;

public class SuitTailor {
    public void use(Men men) {
        men.work();
        men.lead();
        men.dress();
        men.fit();
        men.social();

        if (men instanceof Gentleman) {
            System.out.println("men is instance of Gentleman");
            Gentleman gentleman = (Gentleman) men;
            gentleman.etiquette();
        }
    }
}
