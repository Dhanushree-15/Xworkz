package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class RouterImpl implements IRouter {
    public void connect() { System.out.println("RouterImpl - connect"); }
    public void disconnect() { System.out.println("RouterImpl - disconnect"); }
    public void reset() { System.out.println("RouterImpl - reset"); }
}
