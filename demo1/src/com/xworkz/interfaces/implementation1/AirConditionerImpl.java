package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IAirConditioner;

public class AirConditionerImpl implements IAirConditioner {
    public void turnOn() {
        System.out.println("AirConditionerImpl - turnOn");
    }
    public void turnOff() {
        System.out.println("AirConditionerImpl - turnOff");
    }
    public void setTemperature() {
        System.out.println("AirConditionerImpl - setTemperature");
    }
}
