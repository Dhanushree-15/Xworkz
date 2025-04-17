package com.xworkz.interfaces.implementation5;

import com.xworkz.interfaces.interfaces.*;

public class Boats implements ICamera, IPrinter, ISpeaker, IAirConditioner, IMicrowave {
    public void clickPhoto() { System.out.println("MultiImpl8 - clickPhoto"); }
    public void recordVideo() { System.out.println("MultiImpl8 - recordVideo"); }
    public void zoom() { System.out.println("MultiImpl8 - zoom"); }
    public void print() { System.out.println("MultiImpl8 - print"); }
    public void scan() { System.out.println("MultiImpl8 - scan"); }
    public void copy() { System.out.println("MultiImpl8 - copy"); }
    public void playMusic() { System.out.println("MultiImpl8 - playMusic"); }
    public void pause() { System.out.println("MultiImpl8 - pause"); }
    public void increaseVolume() { System.out.println("MultiImpl8 - increaseVolume"); }
    public void turnOn() { System.out.println("MultiImpl8 - turnOn"); }
    public void turnOff() { System.out.println("MultiImpl8 - turnOff"); }
    public void setTemperature() { System.out.println("MultiImpl8 - setTemperature"); }
    public void start() { System.out.println("MultiImpl8 - start"); }
    public void stop() { System.out.println("MultiImpl8 - stop"); }
    public void setTimer() { System.out.println("MultiImpl8 - setTimer"); }
}
