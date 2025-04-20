package com.xworkz.interfaces.interfaces;

public interface IRouter {
    void connect();
    void disconnect();
    void reset();

    default void startDrill() {
        System.out.println("To start the drill slowly.");
    }

}