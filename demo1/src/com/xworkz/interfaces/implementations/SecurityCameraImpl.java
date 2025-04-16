package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

public class SecurityCameraImpl implements ISecurityCamera {
    public void record() { System.out.println("SecurityCameraImpl - record"); }
    public void streamLive() { System.out.println("SecurityCameraImpl - streamLive"); }
    public void alertMotion() { System.out.println("SecurityCameraImpl - alertMotion"); }
}
