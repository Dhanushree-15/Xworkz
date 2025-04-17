package com.xworkz.interfaces.implementation2;

import com.xworkz.interfaces.interfaces.ILight;
import com.xworkz.interfaces.interfaces.ITelevision;

public class Bulb implements ITelevision, ILight {
    public void powerOn() {
        System.out.println("DualImpl6 - powerOn");
    }

    public void powerOff() {
        System.out.println("DualImpl6 - powerOff");
    }

    public void changeChannel() {
        System.out.println("DualImpl6 - changeChannel");
    }

    public void switchOn() {
        System.out.println("DualImpl6 - switchOn");
    }

    public void switchOff() {
        System.out.println("DualImpl6 - switchOff");
    }

    public void dim() {
        System.out.println("DualImpl6 - dim");
    }
}
