package com.xworkz.interfaces.interfaces;

public interface IPhone {
    void makeCall();
    void receiveCall();
    void charge();

    default void chooseBit() {
        System.out.println("To choose proper drill bit.");
    }

}