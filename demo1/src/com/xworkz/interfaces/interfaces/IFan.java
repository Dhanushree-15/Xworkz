package com.xworkz.interfaces.interfaces;

public interface IFan {
    void switchOn();
    void switchOff();
    void rotate();

    default void holdDrillFirm() {
        System.out.println("To hold the driller firmly.");
    }

}