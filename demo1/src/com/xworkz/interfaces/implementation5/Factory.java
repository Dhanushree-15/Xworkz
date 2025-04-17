package com.xworkz.interfaces.implementation5;

import com.xworkz.interfaces.interfaces.*;

public class Factory implements ILaptop, IChair, ITelevision, ILight, ICamera {
    public void powerOn() { System.out.println("MultiImpl4 - powerOn"); }
    public void powerOff() { System.out.println("MultiImpl4 - powerOff"); }
    public void runProgram() { System.out.println("MultiImpl4 - runProgram"); }
    public void sit() { System.out.println("MultiImpl4 - sit"); }
    public void adjustHeight() { System.out.println("MultiImpl4 - adjustHeight"); }
    public void rotate() { System.out.println("MultiImpl4 - rotate"); }
    public void powerOn1() { System.out.println("MultiImpl4 - powerOn1"); }
    public void powerOff1() { System.out.println("MultiImpl4 - powerOff1"); }
    public void changeChannel() { System.out.println("MultiImpl4 - changeChannel"); }
    public void switchOn() { System.out.println("MultiImpl4 - switchOn"); }
    public void switchOff() { System.out.println("MultiImpl4 - switchOff"); }
    public void dim() { System.out.println("MultiImpl4 - dim"); }
    public void clickPhoto() { System.out.println("MultiImpl4 - clickPhoto"); }
    public void recordVideo() { System.out.println("MultiImpl4 - recordVideo"); }
    public void zoom() { System.out.println("MultiImpl4 - zoom"); }
}
