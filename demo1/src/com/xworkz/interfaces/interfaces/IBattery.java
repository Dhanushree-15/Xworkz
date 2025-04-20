package com.xworkz.interfaces.interfaces;

public interface IBattery {
    void charge();
    void discharge();
    void checkLevel();

    default void alignShelf() {
        System.out.println("To align shelves on the wall.");
    }

}