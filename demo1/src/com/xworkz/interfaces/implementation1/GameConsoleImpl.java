package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IGameConsole;

public class GameConsoleImpl implements IGameConsole {
    public void startGame() { System.out.println("GameConsoleImpl - startGame"); }
    public void pauseGame() { System.out.println("GameConsoleImpl - pauseGame"); }
    public void saveGame() { System.out.println("GameConsoleImpl - saveGame"); }

    public void checkLevel() {
        System.out.println("To check if it's level.");
    }

}