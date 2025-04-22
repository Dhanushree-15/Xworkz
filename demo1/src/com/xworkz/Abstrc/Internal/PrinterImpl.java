package com.xworkz.Abstrc.Internal;

public class PrinterImpl implements Printer {
    @Override
    public void printDocument() {
        System.out.println("printDocument is executed in PrinterImpl");
    }
}
