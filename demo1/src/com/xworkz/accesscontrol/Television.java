package com.xworkz.accesscontrol;

public class Television {
    private int volume;
    public void setVolume(int volume) {
        this.volume = volume;
    }
    public void showVolume() {
        System.out.println("Volume: " + volume);
    }
}
