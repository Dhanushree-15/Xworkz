package com.xworkz.Accesscontrol;

public class Speaker {
    private int maxVolume;
    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }
    public void displayMaxVolume() {
        System.out.println("Max Volume: " + maxVolume);
    }
}
