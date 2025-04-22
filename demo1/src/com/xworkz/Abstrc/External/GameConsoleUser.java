package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.GameConsole;

public class GameConsoleUser {
    private GameConsole device;

    public GameConsoleUser(GameConsole device) {
        this.device = device;
        System.out.println("Initializing GameConsoleUser with GameConsole");
    }

    public void startGame() {
        System.out.println("Using the GameConsole");
        if (this.device != null) {
            this.device.startGame();
        } else {
            System.err.println("GameConsole is not available");
        }
    }
}
