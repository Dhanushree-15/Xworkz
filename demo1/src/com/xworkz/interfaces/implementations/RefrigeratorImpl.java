package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

public class RefrigeratorImpl implements IRefrigerator {
    public void cool() { System.out.println("RefrigeratorImpl - cool"); }
    public void freeze() { System.out.println("RefrigeratorImpl - freeze"); }
    public void defrost() { System.out.println("RefrigeratorImpl - defrost"); }
}
