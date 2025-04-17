package com.xworkz.interfaces.implementation2;

import com.xworkz.interfaces.interfaces.IAirConditioner;
import com.xworkz.interfaces.interfaces.IMicrowave;

public class Stove implements IAirConditioner, IMicrowave {
    public void turnOn() { System.out.println("DualImpl11 - turnOn"); }
    public void turnOff() { System.out.println("DualImpl11 - turnOff"); }
    public void setTemperature() { System.out.println("DualImpl11 - setTemperature"); }
    public void start() { System.out.println("DualImpl11 - start"); }
    public void stop() { System.out.println("DualImpl11 - stop"); }
    public void setTimer() { System.out.println("DualImpl11 - setTimer"); }
}
