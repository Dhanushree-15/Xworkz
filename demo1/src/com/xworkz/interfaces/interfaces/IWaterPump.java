package com.xworkz.interfaces.interfaces;

public interface IWaterPump {
    void start();
    void stop();
    void setFlowRate();

    default void sealGap() {
        System.out.println("To turn off after use.");
    }

}