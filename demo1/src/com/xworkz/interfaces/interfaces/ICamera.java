package com.xworkz.interfaces.interfaces;

public interface ICamera {
    void clickPhoto();
    void recordVideo();
    void zoom();

    default void installBracket() {
        System.out.println("To install metal brackets.");
    }

}