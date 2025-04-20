package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IDoorSensor;

public class DoorSensorImpl implements IDoorSensor {
    public void detectOpen() { System.out.println("DoorSensorImpl - detectOpen"); }
    public void detectClose() { System.out.println("DoorSensorImpl - detectClose"); }
    public void sendAlert() { System.out.println("DoorSensorImpl - sendAlert"); }

    public void routeCable() {
        System.out.println("To route cables through walls.");
    }

}