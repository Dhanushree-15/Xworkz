package com.xworkz.inheritence.internal.ocean;

public class OceanUser {
    public void explore(Ocean ocean) {
        ocean.depth();
        ocean.marineLife();
        ocean.waves();
        ocean.temperature();
        ocean.tides();

        if (ocean instanceof Pacific) {
            System.out.println("ocean is instance of Pacific");
            Pacific pacific = (Pacific) ocean;
            pacific.discover();
        }
    }
}
