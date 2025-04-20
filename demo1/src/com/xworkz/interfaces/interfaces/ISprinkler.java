package com.xworkz.interfaces.interfaces;

public interface ISprinkler {
    void start();
    void stop();
    void schedule();

    default void holdFirm() {
        System.out.println("To mark using a level.");
    }

}