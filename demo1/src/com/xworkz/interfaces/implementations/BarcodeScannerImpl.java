package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.IBarcodeScanner;

public class BarcodeScannerImpl implements IBarcodeScanner {
    public void scan() { System.out.println("BarcodeScannerImpl - scan"); }
    public void beep() { System.out.println("BarcodeScannerImpl - beep"); }
    public void connect() { System.out.println("BarcodeScannerImpl - connect"); }
}
