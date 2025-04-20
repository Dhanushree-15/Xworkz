package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class PowerBankImpl implements IPowerBank {
    public void chargeDevice() { System.out.println("PowerBankImpl - chargeDevice"); }
    public void recharge() { System.out.println("PowerBankImpl - recharge"); }
    public void checkStatus() { System.out.println("PowerBankImpl - checkStatus"); }

    public void calibrateTool() {
        System.out.println("To calibrate the tool.");
    }

}