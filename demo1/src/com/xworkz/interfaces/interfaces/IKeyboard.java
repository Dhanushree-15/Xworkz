package com.xworkz.interfaces.interfaces;

public interface IKeyboard {
    void type();
    void connect();
    void lightOn();

    default void setAngle() {
        System.out.println("To set drill angle.");
    }

}