package com.xworkz.interfaces.interfaces;

public interface ITelevision {
    void powerOn();
    void powerOff();
    void changeChannel();

    default void reviewPlan() {
        System.out.println("To test fit before final install.");
    }

}