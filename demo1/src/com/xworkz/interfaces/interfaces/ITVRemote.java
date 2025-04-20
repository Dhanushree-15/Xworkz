package com.xworkz.interfaces.interfaces;

public interface ITVRemote {
    void changeChannel();
    void increaseVolume();
    void mute();

    default void clearDebris() {
        System.out.println("To clear drilling debris.");
    }

}