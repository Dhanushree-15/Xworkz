package com.xworkz.interfaces.interfaces;

public interface IFireAlarm {
    void detectSmoke();
    void soundAlarm();
    void reset();

    default void replaceBit() {
        System.out.println("To replace a worn drill bit.");
    }

}