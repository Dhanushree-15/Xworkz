package com.xworkz.inheritence.internal.milk;

public class DairyShop {
    public void use(Milk milk) {
        milk.calcium();
        milk.cook();
        milk.immunity();
        milk.daily();
        milk.types();

        if (milk instanceof AlmondMilk) {
            System.out.println("milk is instance of AlmondMilk");
            AlmondMilk almond = (AlmondMilk) milk;
            almond.veganFriendly();
        }
    }
}
