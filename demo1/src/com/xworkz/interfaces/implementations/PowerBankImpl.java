package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

public class PowerBankImpl implements IPowerBank {
    public void chargeDevice() { System.out.println("PowerBankImpl - chargeDevice"); }
    public void recharge() { System.out.println("PowerBankImpl - recharge"); }
    public void checkStatus() { System.out.println("PowerBankImpl - checkStatus"); }
}
