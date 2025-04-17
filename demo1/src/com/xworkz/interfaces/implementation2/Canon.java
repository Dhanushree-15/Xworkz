package com.xworkz.interfaces.implementation2;

import com.xworkz.interfaces.interfaces.ICamera;
import com.xworkz.interfaces.interfaces.ILight;

public class Canon implements ILight, ICamera {
    public void switchOn() { System.out.println("DualImpl7 - switchOn"); }
    public void switchOff() { System.out.println("DualImpl7 - switchOff"); }
    public void dim() { System.out.println("DualImpl7 - dim"); }
    public void clickPhoto() { System.out.println("DualImpl7 - clickPhoto"); }
    public void recordVideo() { System.out.println("DualImpl7 - recordVideo"); }
    public void zoom() { System.out.println("DualImpl7 - zoom"); }
}
