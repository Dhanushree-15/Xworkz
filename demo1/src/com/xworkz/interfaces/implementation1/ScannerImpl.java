package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class ScannerImpl implements IScanner {
    public void scanDocument() { System.out.println("ScannerImpl - scanDocument"); }
    public void scanImage() { System.out.println("ScannerImpl - scanImage"); }
    public void preview() { System.out.println("ScannerImpl - preview"); }

    public void checkBattery() {
        System.out.println("To check battery level.");
    }

}