package com.xworkz.interfaces.interfaces;

public interface IIntercom {
    void call();
    void receiveCall();
    void endCall();

    default void removeScrew() {
        System.out.println("To remove an old screw.");
    }

}