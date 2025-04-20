package com.xworkz.interfaces.interfaces;

public interface ITablet {
    void tap();
    void swipe();
    void installApp();

    default void alignBracket() {
        System.out.println("To align the bracket correctly.");
    }

}