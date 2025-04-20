package com.xworkz.interfaces.interfaces;

public interface ISmartMirror {
    void displayWeather();
    void showTime();
    void adjustBrightness();

    default void inspectWork() {
        System.out.println("To inspect the drilled hole.");
    }

}