package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.ICamera;

public class CameraImpl implements ICamera {
    public void clickPhoto() { System.out.println("CameraImpl - clickPhoto"); }
    public void recordVideo() { System.out.println("CameraImpl - recordVideo"); }
    public void zoom() { System.out.println("CameraImpl - zoom"); }
}
