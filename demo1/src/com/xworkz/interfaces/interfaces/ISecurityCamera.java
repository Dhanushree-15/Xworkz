package com.xworkz.interfaces.interfaces;

public interface ISecurityCamera {
    void record();
    void streamLive();
    void alertMotion();

    default void measureTwice() {
        System.out.println("To check battery level.");
    }

}