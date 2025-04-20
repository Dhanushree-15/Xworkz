package com.xworkz.interfaces.interfaces;

public interface IProjector {
    void projectImage();
    void adjustFocus();
    void shutDown();

    default void braceWall() {
        System.out.println("To brace the wall from behind.");
    }

}