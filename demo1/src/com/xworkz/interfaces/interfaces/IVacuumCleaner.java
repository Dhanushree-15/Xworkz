package com.xworkz.interfaces.interfaces;

public interface IVacuumCleaner {
    void start();
    void stop();
    void changeMode();

    default void testHold() {
        System.out.println("To smooth the hole edge.");
    }

}