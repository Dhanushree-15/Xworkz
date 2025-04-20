package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IBarcodeScanner;

public class BarcodeScannerImpl implements IBarcodeScanner {
    public void scan() { System.out.println("BarcodeScannerImpl - scan"); }
    public void beep() { System.out.println("BarcodeScannerImpl - beep"); }
    public void connect() { System.out.println("BarcodeScannerImpl - connect"); }

    public void insertScrew() {
        System.out.println("To insert screws using a driller.");
    }

}