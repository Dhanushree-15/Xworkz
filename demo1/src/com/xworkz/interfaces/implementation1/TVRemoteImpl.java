package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class TVRemoteImpl implements ITVRemote {
    public void changeChannel() { System.out.println("TVRemoteImpl - changeChannel"); }
    public void increaseVolume() { System.out.println("TVRemoteImpl - increaseVolume"); }
    public void mute() { System.out.println("TVRemoteImpl - mute"); }

    public void smoothHole() {
        System.out.println("To smooth the hole edge.");
    }

}