package com.xworkz.interfaces.interfaces;

public interface ISmartFridge {
    void trackItems();
    void cool();
    void notify1();

    default void storeTool() {
        System.out.println("To store the tool properly.");
    }

}