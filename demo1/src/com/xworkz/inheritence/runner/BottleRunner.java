package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.glassbottle.GlassBottle;
import com.xworkz.inheritence.internal.glassbottle.Cap;

public class BottleRunner {
    public static void main(String[] args) {
        System.out.println("---------- Bottle ----------");
        GlassBottle bottle = new GlassBottle();
        bottle.fill();
        bottle.storeWater();
        bottle.storeMilk();
        bottle.madeOfGlass();
        bottle.frozen();

        System.out.println("---------- Cap ----------");
        GlassBottle cap = new Cap();
        cap.fill();
        cap.storeWater();
        cap.storeMilk();
        cap.madeOfGlass();
        cap.frozen();

        System.out.println("---------- Direct Cap ----------");
        Cap directCap = new Cap();
        directCap.fill();
        directCap.storeWater();
        directCap.storeMilk();
        directCap.madeOfGlass();
        directCap.frozen();
    }
}
