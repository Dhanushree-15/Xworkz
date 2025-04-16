package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.ICamera;
import com.xworkz.interfaces.interfaces.IPrinter;

public class DualImpl8 implements ICamera, IPrinter {
    public void clickPhoto() { System.out.println("DualImpl8 - clickPhoto"); }
    public void recordVideo() { System.out.println("DualImpl8 - recordVideo"); }
    public void zoom() { System.out.println("DualImpl8 - zoom"); }
    public void print() { System.out.println("DualImpl8 - print"); }
    public void scan() { System.out.println("DualImpl8 - scan"); }
    public void copy() { System.out.println("DualImpl8 - copy"); }
}
