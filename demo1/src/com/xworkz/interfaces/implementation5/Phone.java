package com.xworkz.interfaces.implementation5;

import com.xworkz.interfaces.interfaces.*;

public class Phone implements IPhone, ILaptop, IChair, ITelevision, ILight {
    public void makeCall() {
        System.out.println("MultiImpl3 - makeCall");
    }

    public void receiveCall() {
        System.out.println("MultiImpl3 - receiveCall");
    }

    public void charge() {
        System.out.println("MultiImpl3 - charge");
    }

    public void powerOn() {
        System.out.println("MultiImpl3 - powerOn");
    }

    public void powerOff() {
        System.out.println("MultiImpl3 - powerOff");
    }

    public void runProgram() {
        System.out.println("MultiImpl3 - runProgram");
    }

    public void sit() {
        System.out.println("MultiImpl3 - sit");
    }

    public void adjustHeight() {
        System.out.println("MultiImpl3 - adjustHeight");
    }

    public void rotate() {
        System.out.println("MultiImpl3 - rotate");
    }

    public void powerOn1() {
        System.out.println("MultiImpl3 - powerOn");
    }

    public void powerOff1() {
        System.out.println("MultiImpl3 - powerOff");
    }

    public void changeChannel() {
        System.out.println("MultiImpl3 - changeChannel");
    }

    public void switchOn() {
        System.out.println("MultiImpl3 - switchOn");
    }

    public void switchOff() {
        System.out.println("MultiImpl3 - switchOff");
    }

    public void dim() {
        System.out.println("MultiImpl3 - dim");
    }
}
