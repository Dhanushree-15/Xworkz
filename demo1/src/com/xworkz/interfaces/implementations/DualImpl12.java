package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.IMicrowave;
import com.xworkz.interfaces.interfaces.IRefrigerator;

public class DualImpl12 implements IMicrowave, IRefrigerator {
    public void start() { System.out.println("DualImpl12 - start"); }
    public void stop() { System.out.println("DualImpl12 - stop"); }
    public void setTimer() { System.out.println("DualImpl12 - setTimer"); }
    public void cool() { System.out.println("DualImpl12 - cool"); }
    public void freeze() { System.out.println("DualImpl12 - freeze"); }
    public void defrost() { System.out.println("DualImpl12 - defrost"); }
}
