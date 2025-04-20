package com.xworkz.interfaces.interfaces;

public interface ISpeakerSystem {
    void turnOn();
    void adjustBass();
    void mute();

    default void markLevel() {
        System.out.println("To stabilize the tool.");
    }

}