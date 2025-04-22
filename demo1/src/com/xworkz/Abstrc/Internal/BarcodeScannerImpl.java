package com.xworkz.Abstrc.Internal;

public class BarcodeScannerImpl implements BarcodeScanner {
    @Override
    public void scanBarcode() {
        System.out.println("scanBarcode is executed in BarcodeScannerImpl");
    }
}
