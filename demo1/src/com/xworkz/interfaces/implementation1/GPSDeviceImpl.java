package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IGPSDevice;

public class GPSDeviceImpl implements IGPSDevice {
    public void navigate() { System.out.println("GPSDeviceImpl - navigate"); }
    public void recalculateRoute() { System.out.println("GPSDeviceImpl - recalculateRoute"); }
    public void showMap() { System.out.println("GPSDeviceImpl - showMap"); }

    public void markSpot() {
        System.out.println("To mark the drilling spot.");
    }

}