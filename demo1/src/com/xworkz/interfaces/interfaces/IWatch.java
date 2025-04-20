package com.xworkz.interfaces.interfaces;

public interface IWatch {
    void showTime();
    void startTimer();
    void stopTimer();

    default void turnOff() {
        System.out.println("To reset the drill bit.");
    }

}