package com.xworkz.interfaces.interfaces;

public interface IMixer {
    void mix();
    void grind();
    void stop();

    default void wipeWall() {
        System.out.println("To wipe the wall clean.");
    }

}