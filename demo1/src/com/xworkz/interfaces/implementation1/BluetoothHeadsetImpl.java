package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IBluetoothHeadset;

public class BluetoothHeadsetImpl implements IBluetoothHeadset {
    public void connect() { System.out.println("BluetoothHeadsetImpl - connect"); }
    public void playMusic() { System.out.println("BluetoothHeadsetImpl - playMusic"); }
    public void answerCall() { System.out.println("BluetoothHeadsetImpl - answerCall"); }
}
