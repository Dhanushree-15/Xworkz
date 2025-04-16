package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.IJuicer;

public class JuicerImpl implements IJuicer {
    public void juiceFruit() { System.out.println("JuicerImpl - juiceFruit"); }
    public void stop() { System.out.println("JuicerImpl - stop"); }
    public void clean() { System.out.println("JuicerImpl - clean"); }
}
