package com.xworkz.inheritence.internal.river;

public class RiverUser {
    public void use(River river) {
        river.length();
        river.origin();
        river.flows();
        river.providesWater();
        river.wildlife();

        if (river instanceof Nile) {
            System.out.println("river is instance of Nile");
            Nile nile = (Nile) river;
            nile.floodSeason(); // Assuming you want a child-specific method
        }
    }
}
