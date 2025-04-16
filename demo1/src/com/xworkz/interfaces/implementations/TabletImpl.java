package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

public class TabletImpl implements ITablet {
    public void tap() { System.out.println("TabletImpl - tap"); }
    public void swipe() { System.out.println("TabletImpl - swipe"); }
    public void installApp() { System.out.println("TabletImpl - installApp"); }
}
