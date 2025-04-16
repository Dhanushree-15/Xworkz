package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.IClock;
import com.xworkz.interfaces.interfaces.IToaster;

public class DualImpl16 implements IToaster, IClock {
    public void insertBread() { System.out.println("DualImpl16 - insertBread"); }
    public void toast() { System.out.println("DualImpl16 - toast"); }
    public void eject() { System.out.println("DualImpl16 - eject"); }
    public void showTime() { System.out.println("DualImpl16 - showTime"); }
    public void setAlarm() { System.out.println("DualImpl16 - setAlarm"); }
    public void stopAlarm() { System.out.println("DualImpl16 - stopAlarm"); }
}
