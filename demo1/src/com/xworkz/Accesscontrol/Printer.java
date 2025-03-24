package com.xworkz.Accesscontrol;

public class Printer {
    private void printHeader() {
        System.out.println("Header Printed");
    }
    public void printDocument() {
        printHeader();
        System.out.println("Document Printing...");
    }
}
