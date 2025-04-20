package com.xworkz.interfaces.interfaces;

public interface ITreadmill {
    void start();
    void stop();
    void adjustIncline();

    default void checkAlignment() {
        System.out.println("To check the alignment.");
    }

}