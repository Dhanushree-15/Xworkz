package com.xworkz.interfaces.interfaces;

public interface IHairDryer {
    void turnOn();
    void adjustHeat();
    void coolShot();

    default void clampItem() {
        System.out.println("To clamp the item securely.");
    }

}