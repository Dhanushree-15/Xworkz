package com.xworkz.inheritence.internal.Mango;

public class FruitSeller {
    public void use(Mango mango) {
        mango.taste();
        mango.provideNutrition();
        mango.boostImmunity();
        mango.availableInSeasons();
        mango.usedInCooking();

        if (mango instanceof Pista) {
            System.out.println("mango is instance of Pista");
            Pista pista = (Pista) mango;
            pista.specialOffer();
        }
    }
}
