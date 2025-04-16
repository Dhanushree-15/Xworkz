package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

public class MultiImpl6 implements ITelevision, ILight, ICamera, IPrinter, ISpeaker {
    public void powerOn() { System.out.println("MultiImpl6 - powerOn"); }
    public void powerOff() { System.out.println("MultiImpl6 - powerOff"); }
    public void changeChannel() { System.out.println("MultiImpl6 - changeChannel"); }
    public void switchOn() { System.out.println("MultiImpl6 - switchOn"); }
    public void switchOff() { System.out.println("MultiImpl6 - switchOff"); }
    public void dim() { System.out.println("MultiImpl6 - dim"); }
    public void clickPhoto() { System.out.println("MultiImpl6 - clickPhoto"); }
    public void recordVideo() { System.out.println("MultiImpl6 - recordVideo"); }
    public void zoom() { System.out.println("MultiImpl6 - zoom"); }
    public void print() { System.out.println("MultiImpl6 - print"); }
    public void scan() { System.out.println("MultiImpl6 - scan"); }
    public void copy() { System.out.println("MultiImpl6 - copy"); }
    public void playMusic() { System.out.println("MultiImpl6 - playMusic"); }
    public void pause() { System.out.println("MultiImpl6 - pause"); }
    public void increaseVolume() { System.out.println("MultiImpl6 - increaseVolume"); }
}
