package com.xworkz.interfaces.interfaces;

public interface ISpeakerSystem {
    void turnOn();
    void adjustBass();
    void mute();

    default void stabilizeTool() {
        System.out.println("To stabilize the tool.");
    }

}