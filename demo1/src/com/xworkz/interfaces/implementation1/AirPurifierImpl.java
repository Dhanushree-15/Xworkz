package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IAirPurifier;

public class AirPurifierImpl implements IAirPurifier {
    public void purifyAir() { System.out.println("AirPurifierImpl - purifyAir"); }
    public void changeFilter() { System.out.println("AirPurifierImpl - changeFilter"); }
    public void turnOn() { System.out.println("AirPurifierImpl - turnOn"); }
}
