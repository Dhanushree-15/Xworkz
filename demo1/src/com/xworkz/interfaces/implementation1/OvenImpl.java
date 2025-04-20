package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class OvenImpl implements IOven {
    public void preheat() { System.out.println("OvenImpl - preheat"); }
    public void bake() { System.out.println("OvenImpl - bake"); }
    public void grill() { System.out.println("OvenImpl - grill"); }

    public void testDrill() {
        System.out.println("To test drill on scrap piece.");
    }

}