package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IMixer;

public class MixerImpl implements IMixer {
    public void mix() { System.out.println("MixerImpl - mix"); }
    public void grind() { System.out.println("MixerImpl - grind"); }
    public void stop() { System.out.println("MixerImpl - stop"); }

    public void wipeWall() {
        System.out.println("To wipe the wall clean.");
    }

}