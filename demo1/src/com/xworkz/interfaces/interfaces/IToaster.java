package com.xworkz.interfaces.interfaces;

public interface IToaster {
    void insertBread();
    void toast();
    void eject();

    default void wearGoggles() {
        System.out.println("To wear protective goggles.");
    }

}