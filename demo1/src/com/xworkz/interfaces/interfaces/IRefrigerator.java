package com.xworkz.interfaces.interfaces;

public interface IRefrigerator {
    void cool();
    void freeze();
    void defrost();

    default void controlSpeed() {
        System.out.println("To control drilling speed.");
    }

}