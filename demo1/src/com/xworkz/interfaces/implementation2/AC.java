package com.xworkz.interfaces.implementation2;

import com.xworkz.interfaces.interfaces.IAirConditioner;
import com.xworkz.interfaces.interfaces.ISpeaker;

public class AC implements ISpeaker, IAirConditioner {
    public void playMusic() {
        System.out.println("DualImpl10 - playMusic");
    }


    public void pause() {
        System.out.println("DualImpl10 - pause");
    }

    public void increaseVolume() {
        System.out.println("DualImpl10 - increaseVolume");
    }

    public void turnOn() {
        System.out.println("DualImpl10 - turnOn");
    }

    public void turnOff() {
        System.out.println("DualImpl10 - turnOff");
    }

    public void setTemperature() {
        System.out.println("DualImpl10 - setTemperature");
    }
}
