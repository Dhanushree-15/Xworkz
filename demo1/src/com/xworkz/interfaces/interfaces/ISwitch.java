package com.xworkz.interfaces.interfaces;

public interface ISwitch {
    void flipOn();
    void flipOff();
    void status();

    default void alignBracket() {
        System.out.println("To hold item firmly.");
    }

}