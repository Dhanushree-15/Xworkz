package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.IBlender;
import com.xworkz.interfaces.interfaces.IWatch;

public class DualImpl18 implements IWatch, IBlender {
    public void showTime() { System.out.println("DualImpl18 - showTime"); }
    public void startTimer() { System.out.println("DualImpl18 - startTimer"); }
    public void stopTimer() { System.out.println("DualImpl18 - stopTimer"); }
    public void blend() { System.out.println("DualImpl18 - blend"); }
    public void pulse() { System.out.println("DualImpl18 - pulse"); }
    public void clean() { System.out.println("DualImpl18 - clean"); }
}
