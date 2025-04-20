package com.xworkz.interfaces.interfaces;

public interface IBarcodeScanner {
    void scan();
    void beep();
    void connect();

    default void insertScrew() {
        System.out.println("To insert screws using a driller.");
    }

}