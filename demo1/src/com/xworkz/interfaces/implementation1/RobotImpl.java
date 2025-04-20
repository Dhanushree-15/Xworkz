package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class RobotImpl implements IRobot {
    public void walk() { System.out.println("RobotImpl - walk"); }
    public void speak() { System.out.println("RobotImpl - speak"); }
    public void grabObject() { System.out.println("RobotImpl - grabObject"); }

    public void gripTool() {
        System.out.println("To grip the tool tightly.");
    }

}