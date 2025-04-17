package com.xworkz.interfaces.implementation5;

import com.xworkz.interfaces.interfaces.*;

public class Apple implements IChair, ITelevision, ILight, ICamera, IPrinter {
    public void sit() { System.out.println("MultiImpl5 - sit"); }
    public void adjustHeight() { System.out.println("MultiImpl5 - adjustHeight"); }
    public void rotate() { System.out.println("MultiImpl5 - rotate"); }
    public void powerOn() { System.out.println("MultiImpl5 - powerOn"); }
    public void powerOff() { System.out.println("MultiImpl5 - powerOff"); }
    public void changeChannel() { System.out.println("MultiImpl5 - changeChannel"); }
    public void switchOn() { System.out.println("MultiImpl5 - switchOn"); }
    public void switchOff() { System.out.println("MultiImpl5 - switchOff"); }
    public void dim() { System.out.println("MultiImpl5 - dim"); }
    public void clickPhoto() { System.out.println("MultiImpl5 - clickPhoto"); }
    public void recordVideo() { System.out.println("MultiImpl5 - recordVideo"); }
    public void zoom() { System.out.println("MultiImpl5 - zoom"); }
    public void print() { System.out.println("MultiImpl5 - print"); }
    public void scan() { System.out.println("MultiImpl5 - scan"); }
    public void copy() { System.out.println("MultiImpl5 - copy"); }
}
