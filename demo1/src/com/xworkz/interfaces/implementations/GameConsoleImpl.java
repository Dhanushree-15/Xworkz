package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.IGameConsole;

public class GameConsoleImpl implements IGameConsole {
    public void startGame() { System.out.println("GameConsoleImpl - startGame"); }
    public void pauseGame() { System.out.println("GameConsoleImpl - pauseGame"); }
    public void saveGame() { System.out.println("GameConsoleImpl - saveGame"); }
}
