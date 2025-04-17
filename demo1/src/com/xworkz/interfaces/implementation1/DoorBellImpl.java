package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IDoorBell;

public class DoorBellImpl implements IDoorBell {
    public void ring() { System.out.println("DoorBellImpl - ring"); }
    public void recordVisitor() { System.out.println("DoorBellImpl - recordVisitor"); }
    public void notifyUser() { System.out.println("DoorBellImpl - notifyUser"); }
}
