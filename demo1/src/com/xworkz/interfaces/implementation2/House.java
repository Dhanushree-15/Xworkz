package com.xworkz.interfaces.implementation2;

import com.xworkz.interfaces.interfaces.IOven;
import com.xworkz.interfaces.interfaces.IToaster;

public class House implements IOven, IToaster {
    public void preheat() { System.out.println("DualImpl15 - preheat"); }
    public void bake() { System.out.println("DualImpl15 - bake"); }
    public void grill() { System.out.println("DualImpl15 - grill"); }
    public void insertBread() { System.out.println("DualImpl15 - insertBread"); }
    public void toast() { System.out.println("DualImpl15 - toast"); }
    public void eject() { System.out.println("DualImpl15 - eject"); }
}
