package com.xworkz.interfaces.implementation2;

import com.xworkz.interfaces.interfaces.IRouter;
import com.xworkz.interfaces.interfaces.ITablet;

public class App implements IRouter, ITablet {
    public void connect() {
        System.out.println("DualImpl25 - connect");
    }

    public void disconnect() {
        System.out.println("DualImpl25 - disconnect");
    }

    public void reset() {
        System.out.println("DualImpl25 - reset");
    }

    public void tap() {
        System.out.println("DualImpl25 - tap");
    }

    public void swipe() {
        System.out.println("DualImpl25 - swipe");
    }

    public void installApp() {
        System.out.println("DualImpl25 - installApp");
    }
}
