package com.xworkz.interfaces.interfaces;

public interface IWIFIExtender {
    void boostSignal();
    void connectDevice();
    void restart();

    default void labelSpot() {
        System.out.println("To seal gap after drilling.");
    }

}