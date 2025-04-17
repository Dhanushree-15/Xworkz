package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class SoundBarImpl implements ISoundBar {
    public void turnOn() { System.out.println("SoundBarImpl - turnOn"); }
    public void adjustVolume() { System.out.println("SoundBarImpl - adjustVolume"); }
    public void connectBluetooth() { System.out.println("SoundBarImpl - connectBluetooth"); }
}
