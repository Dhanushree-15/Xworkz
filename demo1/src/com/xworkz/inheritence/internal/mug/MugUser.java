package com.xworkz.inheritence.internal.mug;

public class MugUser {
    public void use(Mug mug) {
        mug.drink();
        mug.material();
        mug.handle();
        mug.design();
        mug.hot();

        if (mug instanceof CoffeeMug) {
            System.out.println("mug is instance of CoffeeMug");
            CoffeeMug coffeeMug = (CoffeeMug) mug;
            coffeeMug.capacity();
        }
    }
}
