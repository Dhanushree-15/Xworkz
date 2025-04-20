package com.xworkz.interfaces.interfaces;

public interface IGPSDevice {
    void navigate();
    void recalculateRoute();
    void showMap();

    default void markSpot() {
        System.out.println("To mark the drilling spot.");
    }

}