package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IChair;

public class ChairImpl implements IChair {
    public void sit() { System.out.println("ChairImpl - sit"); }
    public void adjustHeight() { System.out.println("ChairImpl - adjustHeight"); }
    public void rotate() { System.out.println("ChairImpl - rotate"); }
}
