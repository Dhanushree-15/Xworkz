package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

public class TreadmillImpl implements ITreadmill {
    public void start() { System.out.println("TreadmillImpl - start"); }
    public void stop() { System.out.println("TreadmillImpl - stop"); }
    public void adjustIncline() { System.out.println("TreadmillImpl - adjustIncline"); }
}
