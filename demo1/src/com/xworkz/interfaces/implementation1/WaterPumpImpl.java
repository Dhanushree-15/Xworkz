package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class WaterPumpImpl implements IWaterPump {
    public void start() { System.out.println("WaterPumpImpl - start"); }
    public void stop() { System.out.println("WaterPumpImpl - stop"); }
    public void setFlowRate() { System.out.println("WaterPumpImpl - setFlowRate"); }
}
