package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

public class MultiImpl9 implements IPrinter, ISpeaker, IAirConditioner, IMicrowave, IRefrigerator {
    public void print() { System.out.println("MultiImpl9 - print"); }
    public void scan() { System.out.println("MultiImpl9 - scan"); }
    public void copy() { System.out.println("MultiImpl9 - copy"); }
    public void playMusic() { System.out.println("MultiImpl9 - playMusic"); }
    public void pause() { System.out.println("MultiImpl9 - pause"); }
    public void increaseVolume() { System.out.println("MultiImpl9 - increaseVolume"); }
    public void turnOn() { System.out.println("MultiImpl9 - turnOn"); }
    public void turnOff() { System.out.println("MultiImpl9 - turnOff"); }
    public void setTemperature() { System.out.println("MultiImpl9 - setTemperature"); }
    public void start() { System.out.println("MultiImpl9 - start"); }
    public void stop() { System.out.println("MultiImpl9 - stop"); }
    public void setTimer() { System.out.println("MultiImpl9 - setTimer"); }
    public void cool() { System.out.println("MultiImpl9 - cool"); }
    public void freeze() { System.out.println("MultiImpl9 - freeze"); }
    public void defrost() { System.out.println("MultiImpl9 - defrost"); }
}
