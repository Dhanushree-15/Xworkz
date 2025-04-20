package com.xworkz.interfaces.interfaces;

public interface ISpeaker {
    void playMusic();
    void pause();
    void increaseVolume();

    default void adjustTorque() {
        System.out.println("To adjust torque settings.");
    }

}