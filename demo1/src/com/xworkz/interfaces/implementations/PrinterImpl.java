package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

public class PrinterImpl implements IPrinter {
    public void print() { System.out.println("PrinterImpl - print"); }
    public void scan() { System.out.println("PrinterImpl - scan"); }
    public void copy() { System.out.println("PrinterImpl - copy"); }
}
