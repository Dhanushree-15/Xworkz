package com.xworkz.interfaces.interfaces;

public interface IPowerBank {
    void chargeDevice();
    void recharge();
    void checkStatus();

    default void calibrateTool() {
        System.out.println("To calibrate the tool.");
    }

}