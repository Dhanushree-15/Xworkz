package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.woodcaboard.WoodCaboard;
import com.xworkz.inheritence.internal.woodcaboard.Door;

public class WoodCaboardRunner {
    public static void main(String[] args) {
        WoodCaboard caboard1 = new WoodCaboard();
        caboard1.lock();
        caboard1.key();
        caboard1.handle();
        caboard1.open();
        caboard1.close();

        System.out.println("-------------------");
        WoodCaboard caboard = new Door();
        caboard.lock();
        caboard.key();
        caboard.handle();
        caboard.open();
        caboard.close();

        System.out.println("-------------------");
        Door door = new Door();
        door.lock();
        door.key();
        door.handle();
        door.open();
        door.close();
    }

}
