package com.xworkz.interfaces.interfaces;

public interface IVacuumCleaner {
    void start();
    void stop();
    void changeMode();

    default void smoothHole() {
        System.out.println("To smooth the hole edge.");
    }

}