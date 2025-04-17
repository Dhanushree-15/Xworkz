package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class ThermometerImpl implements IThermometer {
    public void measureTemp() { System.out.println("ThermometerImpl - measureTemp"); }
    public void reset() { System.out.println("ThermometerImpl - reset"); }
    public void calibrate() { System.out.println("ThermometerImpl - calibrate"); }
}
