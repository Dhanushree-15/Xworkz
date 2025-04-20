package com.xworkz.interfaces.interfaces;

public interface ISoundBar {
    void turnOn();
    void adjustVolume();
    void connectBluetooth();

    default void cleanBit() {
        System.out.println("To clean the drill bit.");
    }

}