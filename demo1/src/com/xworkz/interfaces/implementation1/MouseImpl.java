package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IMouse;

public class MouseImpl implements IMouse {
    public void click() { System.out.println("MouseImpl - click"); }
    public void scroll() { System.out.println("MouseImpl - scroll"); }
    public void connect() { System.out.println("MouseImpl - connect"); }

    public void readManual() {
        System.out.println("To read the instruction manual.");
    }

}