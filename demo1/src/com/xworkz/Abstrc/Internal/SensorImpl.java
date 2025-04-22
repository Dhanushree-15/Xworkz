package com.xworkz.Abstrc.Internal;

public class SensorImpl implements Sensor {
    @Override
    public void detectMotion() {
        System.out.println("detectMotion is executed in SensorImpl");
    }
}
