package com.xworkz.interfaces.interfaces;

public interface IBlender {
    void blend();
    void pulse();
    void clean();

    default void mountTV() {
        System.out.println("To mount a television safely.");
    }

}