package com.xworkz.interfaces.interfaces;

public interface IGameConsole {
    void startGame();
    void pauseGame();
    void saveGame();

    default void checkLevel() {
        System.out.println("To check if it's level.");
    }

}