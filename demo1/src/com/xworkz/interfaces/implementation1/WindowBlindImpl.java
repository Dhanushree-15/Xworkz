package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class WindowBlindImpl implements IWindowBlind {
    public void open() { System.out.println("WindowBlindImpl - open"); }
    public void close() { System.out.println("WindowBlindImpl - close"); }
    public void adjustTilt() { System.out.println("WindowBlindImpl - adjustTilt"); }
}
