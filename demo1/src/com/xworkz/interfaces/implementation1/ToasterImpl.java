package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class ToasterImpl implements IToaster {
    public void insertBread() { System.out.println("ToasterImpl - insertBread"); }
    public void toast() { System.out.println("ToasterImpl - toast"); }
    public void eject() { System.out.println("ToasterImpl - eject"); }

    public void checkAlignment() {
        System.out.println("To check the alignment.");
    }

}