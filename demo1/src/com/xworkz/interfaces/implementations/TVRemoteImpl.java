package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

public class TVRemoteImpl implements ITVRemote {
    public void changeChannel() { System.out.println("TVRemoteImpl - changeChannel"); }
    public void increaseVolume() { System.out.println("TVRemoteImpl - increaseVolume"); }
    public void mute() { System.out.println("TVRemoteImpl - mute"); }
}
