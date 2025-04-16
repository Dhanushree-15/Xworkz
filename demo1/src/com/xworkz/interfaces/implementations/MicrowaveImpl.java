package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.IMicrowave;

public class MicrowaveImpl implements IMicrowave {
    public void start() { System.out.println("MicrowaveImpl - start"); }
    public void stop() { System.out.println("MicrowaveImpl - stop"); }
    public void setTimer() { System.out.println("MicrowaveImpl - setTimer"); }
}
