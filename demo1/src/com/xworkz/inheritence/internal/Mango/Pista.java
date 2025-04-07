package com.xworkz.inheritence.internal.Mango;

public class Pista extends Mango {
    public Pista() {
        super();
        System.out.println("Running non-arg constructor GreenApple");
    }
    @Override
    public void taste() {
        System.out.println("Mango has a sweet and tangy taste--child");
    }
    @Override
    public void provideNutrition() {
        System.out.println("Mango provides essential nutrients--child");
    }
    @Override
    public void boostImmunity() {
        System.out.println("Mango helps in boosting immunity--child");
    }
    @Override
    public void availableInSeasons() {
        System.out.println("Mangos are available in different seasons--child");
    }
    @Override
    public void usedInCooking() {
        System.out.println("Mango is used in making pies and juices--child");
    }
    public void specialOffer() {
        System.out.println("Pista mango comes with a summer discount! --child");
    }
}
