package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.switchboard.SwitchBoard;
import com.xworkz.inheritence.internal.switchboard.Mobile;

public class ElectronicsRunner {
    public static void main(String[] args) {
        SwitchBoard device = new SwitchBoard();
        device.powerOn();
        device.powerOff();
        device.battery();
        device.charge();
        device.connect();

        System.out.println("-----------");

        SwitchBoard mobileDevice = new Mobile();
        mobileDevice.powerOn();
        mobileDevice.powerOff();
        mobileDevice.battery();
        mobileDevice.charge();
        mobileDevice.connect();

        System.out.println("-----------");

        Mobile mobile = new Mobile();
        mobile.powerOn();
        mobile.powerOff();
        mobile.battery();
        mobile.charge();
        mobile.connect();
    }
}
