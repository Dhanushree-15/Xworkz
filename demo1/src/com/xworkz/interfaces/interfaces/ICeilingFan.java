package com.xworkz.interfaces.interfaces;

public interface ICeilingFan {
    void setSpeed();
    void reverseDirection();
    void stop();

    default void tapAnchor() {
        System.out.println("To tap wall anchors into place.");
    }

}