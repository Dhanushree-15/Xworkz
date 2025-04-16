package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.IDoorSensor;

public class DoorSensorImpl implements IDoorSensor {
    public void detectOpen() { System.out.println("DoorSensorImpl - detectOpen"); }
    public void detectClose() { System.out.println("DoorSensorImpl - detectClose"); }
    public void sendAlert() { System.out.println("DoorSensorImpl - sendAlert"); }
}
