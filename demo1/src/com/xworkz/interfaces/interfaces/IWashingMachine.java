package com.xworkz.interfaces.interfaces;

public interface IWashingMachine {
    void wash();
    void rinse();
    void spin();

    default void testHold() {
        System.out.println("To test if item holds.");
    }

}