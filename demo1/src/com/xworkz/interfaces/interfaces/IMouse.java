package com.xworkz.interfaces.interfaces;

public interface IMouse {
    void click();
    void scroll();
    void connect();

    default void readManual() {
        System.out.println("To read the instruction manual.");
    }

}