package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.ICamera;

public class CameraImpl implements ICamera {
    public void clickPhoto() { System.out.println("CameraImpl - clickPhoto"); }
    public void recordVideo() { System.out.println("CameraImpl - recordVideo"); }
    public void zoom() { System.out.println("CameraImpl - zoom"); }

    public void installBracket() {
        System.out.println("To install metal brackets.");
    }

}