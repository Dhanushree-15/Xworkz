package com.xworkz.interfaces.implementation5;

import com.xworkz.interfaces.interfaces.*;

public class Whirlpool implements IAirConditioner, IMicrowave, IRefrigerator, IWashingMachine, IOven {
    public void turnOn() { System.out.println("MultiImpl11 - turnOn"); }
    public void turnOff() { System.out.println("MultiImpl11 - turnOff"); }
    public void setTemperature() { System.out.println("MultiImpl11 - setTemperature"); }
    public void start() { System.out.println("MultiImpl11 - start"); }
    public void stop() { System.out.println("MultiImpl11 - stop"); }
    public void setTimer() { System.out.println("MultiImpl11 - setTimer"); }
    public void cool() { System.out.println("MultiImpl11 - cool"); }
    public void freeze() { System.out.println("MultiImpl11 - freeze"); }
    public void defrost() { System.out.println("MultiImpl11 - defrost"); }
    public void wash() { System.out.println("MultiImpl11 - wash"); }
    public void rinse() { System.out.println("MultiImpl11 - rinse"); }
    public void spin() { System.out.println("MultiImpl11 - spin"); }
    public void preheat() { System.out.println("MultiImpl11 - preheat"); }
    public void bake() { System.out.println("MultiImpl11 - bake"); }
    public void grill() { System.out.println("MultiImpl11 - grill"); }
}
