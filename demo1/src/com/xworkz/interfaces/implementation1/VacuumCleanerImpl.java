package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class VacuumCleanerImpl implements IVacuumCleaner {
    public void start() { System.out.println("VacuumCleanerImpl - start"); }
    public void stop() { System.out.println("VacuumCleanerImpl - stop"); }
    public void changeMode() { System.out.println("VacuumCleanerImpl - changeMode"); }

    public void testHold() {
        System.out.println("To test if item holds.");
    }

}