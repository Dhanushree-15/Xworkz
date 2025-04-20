package com.xworkz.interfaces.interfaces;

public interface IRobot {
    void walk();
    void speak();
    void grabObject();

    default void gripTool() {
        System.out.println("To grip the tool tightly.");
    }

}