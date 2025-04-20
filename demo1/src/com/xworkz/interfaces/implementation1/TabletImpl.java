package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class TabletImpl implements ITablet {
    public void tap() { System.out.println("TabletImpl - tap"); }
    public void swipe() { System.out.println("TabletImpl - swipe"); }
    public void installApp() { System.out.println("TabletImpl - installApp"); }

    public void testFit() {
        System.out.println("To test fit before final install.");
    }

}