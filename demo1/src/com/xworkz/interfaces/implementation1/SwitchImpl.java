package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class SwitchImpl implements ISwitch {
    public void flipOn() { System.out.println("SwitchImpl - flipOn"); }
    public void flipOff() { System.out.println("SwitchImpl - flipOff"); }
    public void status() { System.out.println("SwitchImpl - status"); }
}
