package com.xworkz.Abstrc.External;

import com.xworkz.Abstrc.Internal.Calculator;

public class CalculatorUser {
    private Calculator device;

    public CalculatorUser(Calculator device) {
        this.device = device;
        System.out.println("Initializing CalculatorUser with Calculator");
    }

    public void calculateSum() {
        System.out.println("Using the Calculator");
        if (this.device != null) {
            this.device.calculateSum();
        } else {
            System.err.println("Calculator is not available");
        }
    }
}
