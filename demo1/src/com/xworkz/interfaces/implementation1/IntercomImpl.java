package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IIntercom;

public class IntercomImpl implements IIntercom {
    public void call() { System.out.println("IntercomImpl - call"); }
    public void receiveCall() { System.out.println("IntercomImpl - receiveCall"); }
    public void endCall() { System.out.println("IntercomImpl - endCall"); }

    public void removeScrew() {
        System.out.println("To remove an old screw.");
    }

}