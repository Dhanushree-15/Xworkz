package com.xworkz.inheritence.internal.pig;

public class PigUser {
    public void use(Pig pig) {
        pig.eat();
        pig.live();
        pig.smell();
        pig.social();
        pig.smart();

        if (pig instanceof WildPig) {
            System.out.println("pig is instance of WildPig");
            WildPig wild = (WildPig) pig;
            wild.defend();
        }
    }
}
