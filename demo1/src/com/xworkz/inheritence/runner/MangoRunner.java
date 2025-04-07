package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.Mango.Mango;
import com.xworkz.inheritence.internal.Mango.Pista;
import com.xworkz.inheritence.internal.Mango.FruitSeller;

public class MangoRunner {
    public static void main(String[] args) {
        Mango apple1 = new Mango();
        apple1.taste();
        apple1.provideNutrition();
        apple1.boostImmunity();
        apple1.availableInSeasons();
        apple1.usedInCooking();

        System.out.println("-------------------");

        Mango apple = new Pista();
        apple.taste();
        apple.provideNutrition();
        apple.boostImmunity();
        apple.availableInSeasons();
        apple.usedInCooking();

        System.out.println("-----------------");

        Pista greenApple = new Pista();
        greenApple.taste();
        greenApple.provideNutrition();
        greenApple.boostImmunity();
        greenApple.availableInSeasons();
        greenApple.usedInCooking();

        System.out.println("------casting------");
        FruitSeller seller = new FruitSeller();
        seller.use(apple1);
        seller.use(apple);
        seller.use(greenApple);
    }
}
