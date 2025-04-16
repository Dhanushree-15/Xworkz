package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;
public class MultiImpl7 implements ILight, ICamera, IPrinter, ISpeaker, IAirConditioner {
    public void switchOn() { System.out.println("MultiImpl7 - switchOn"); }
    public void switchOff() { System.out.println("MultiImpl7 - switchOff"); }
    public void dim() { System.out.println("MultiImpl7 - dim"); }
    public void clickPhoto() { System.out.println("MultiImpl7 - clickPhoto"); }
    public void recordVideo() { System.out.println("MultiImpl7 - recordVideo"); }
    public void zoom() { System.out.println("MultiImpl7 - zoom"); }
    public void print() { System.out.println("MultiImpl7 - print"); }
    public void scan() { System.out.println("MultiImpl7 - scan"); }
    public void copy() { System.out.println("MultiImpl7 - copy"); }
    public void playMusic() { System.out.println("MultiImpl7 - playMusic"); }
    public void pause() { System.out.println("MultiImpl7 - pause"); }
    public void increaseVolume() { System.out.println("MultiImpl7 - increaseVolume"); }
    public void turnOn() { System.out.println("MultiImpl7 - turnOn"); }
    public void turnOff() { System.out.println("MultiImpl7 - turnOff"); }
    public void setTemperature() { System.out.println("MultiImpl7 - setTemperature"); }
}
