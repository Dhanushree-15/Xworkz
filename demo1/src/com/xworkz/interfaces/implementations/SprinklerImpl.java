package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

public class SprinklerImpl implements ISprinkler {
    public void start() { System.out.println("SprinklerImpl - start"); }
    public void stop() { System.out.println("SprinklerImpl - stop"); }
    public void schedule() { System.out.println("SprinklerImpl - schedule"); }
}
