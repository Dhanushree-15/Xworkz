package com.xworkz.interfaces.interfaces;

public interface ISpeaker {
    void playMusic();
    void pause();
    void increaseVolume();

    default void stabilizeTool() {
        System.out.println("To adjust torque settings.");
    }

}