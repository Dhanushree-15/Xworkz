package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IGarageDoor;

public class GarageDoorImpl implements IGarageDoor {
    public void open() { System.out.println("GarageDoorImpl - open"); }
    public void close() { System.out.println("GarageDoorImpl - close"); }
    public void lock() { System.out.println("GarageDoorImpl - lock"); }
}
