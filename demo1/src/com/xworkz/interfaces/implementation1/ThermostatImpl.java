package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class ThermostatImpl implements IThermostat {
    public void setTemp() { System.out.println("ThermostatImpl - setTemp"); }
    public void increaseTemp() { System.out.println("ThermostatImpl - increaseTemp"); }
    public void decreaseTemp() { System.out.println("ThermostatImpl - decreaseTemp"); }
}
