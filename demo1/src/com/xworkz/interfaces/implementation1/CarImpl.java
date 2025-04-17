package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.ICar;

public class CarImpl implements ICar {
    public void startEngine() { System.out.println("CarImpl - startEngine"); }
    public void stopEngine() { System.out.println("CarImpl - stopEngine"); }
    public void honk() { System.out.println("CarImpl - honk"); }
}
