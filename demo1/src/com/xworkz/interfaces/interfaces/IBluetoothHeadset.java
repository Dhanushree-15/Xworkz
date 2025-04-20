package com.xworkz.interfaces.interfaces;

public interface IBluetoothHeadset {
    void connect();
    void playMusic();
    void answerCall();

    default void hangPicture() {
        System.out.println("To hang a picture frame securely.");
    }

}