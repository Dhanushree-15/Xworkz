package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IDrone;

public class DroneImpl implements IDrone {
    public void takeOff() { System.out.println("DroneImpl - takeOff"); }
    public void land() { System.out.println("DroneImpl - land"); }
    public void fly() { System.out.println("DroneImpl - fly"); }
}
