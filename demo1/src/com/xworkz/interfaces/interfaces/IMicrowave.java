package com.xworkz.interfaces.interfaces;

public interface IMicrowave {
    void start();
    void stop();
    void setTimer();

    default void useMask() {
        System.out.println("To use mask to avoid dust.");
    }

}