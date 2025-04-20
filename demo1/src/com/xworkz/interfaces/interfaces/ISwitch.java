package com.xworkz.interfaces.interfaces;

public interface ISwitch {
    void flipOn();
    void flipOff();
    void status();

    default void holdFirm() {
        System.out.println("To hold item firmly.");
    }

}