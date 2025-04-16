package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.IRouter;
import com.xworkz.interfaces.interfaces.IVacuumCleaner;

public class DualImpl24 implements IVacuumCleaner, IRouter {
    public void start() { System.out.println("DualImpl24 - start"); }
    public void stop() { System.out.println("DualImpl24 - stop"); }
    public void changeMode() { System.out.println("DualImpl24 - changeMode"); }
    public void connect() { System.out.println("DualImpl24 - connect"); }
    public void disconnect() { System.out.println("DualImpl24 - disconnect"); }
    public void reset() { System.out.println("DualImpl24 - reset"); }
}
