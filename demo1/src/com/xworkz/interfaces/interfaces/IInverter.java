package com.xworkz.interfaces.interfaces;

public interface IInverter {
    void supplyPower();
    void chargeBattery();
    void switchMode();

    default void findStud() {
        System.out.println("To find a stud behind wall.");
    }

}