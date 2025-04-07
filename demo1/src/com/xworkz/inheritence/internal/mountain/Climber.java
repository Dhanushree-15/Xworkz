package com.xworkz.inheritence.internal.mountain;

public class Climber {
    public void climb(Mountain mountain) {
        mountain.height();
        mountain.climate();
        mountain.location();
        mountain.trekking();
        mountain.wildlife();

        if (mountain instanceof Everest) {
            System.out.println("mountain is instance of Everest");
            Everest everest = (Everest) mountain;
            everest.snowZone();
        }
    }
}
