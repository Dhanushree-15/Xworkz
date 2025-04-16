package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.IGPSDevice;

public class GPSDeviceImpl implements IGPSDevice {
    public void navigate() { System.out.println("GPSDeviceImpl - navigate"); }
    public void recalculateRoute() { System.out.println("GPSDeviceImpl - recalculateRoute"); }
    public void showMap() { System.out.println("GPSDeviceImpl - showMap"); }
}
