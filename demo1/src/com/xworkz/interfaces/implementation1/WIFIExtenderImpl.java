package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class WIFIExtenderImpl implements IWIFIExtender {
    public void boostSignal() { System.out.println("WIFIExtenderImpl - boostSignal"); }
    public void connectDevice() { System.out.println("WIFIExtenderImpl - connectDevice"); }
    public void restart() { System.out.println("WIFIExtenderImpl - restart"); }
}
