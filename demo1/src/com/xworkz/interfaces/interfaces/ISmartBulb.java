package com.xworkz.interfaces.interfaces;

public interface ISmartBulb {
    void changeColor();
    void dimLight();
    void turnOff();

    default void storeTool() {
        System.out.println("To measure twice, drill once.");
    }

}