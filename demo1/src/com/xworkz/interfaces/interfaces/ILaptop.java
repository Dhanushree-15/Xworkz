package com.xworkz.interfaces.interfaces;

public interface ILaptop {
    void powerOn();
    void powerOff();
    void runProgram();

    default void insertBit() {
        System.out.println("To insert the drill bit.");
    }

}