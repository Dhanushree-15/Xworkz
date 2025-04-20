package com.xworkz.interfaces.interfaces;

public interface IMonitor {
    void displayImage();
    void adjustBrightness();
    void turnOff();

    default void rechargeTool() {
        System.out.println("To recharge the driller.");
    }

}