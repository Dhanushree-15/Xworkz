package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class SpeakerSystemImpl implements ISpeakerSystem {
    public void turnOn() { System.out.println("SpeakerSystemImpl - turnOn"); }
    public void adjustBass() { System.out.println("SpeakerSystemImpl - adjustBass"); }
    public void mute() { System.out.println("SpeakerSystemImpl - mute"); }

    public void markLevel() {
        System.out.println("To mark using a level.");
    }

}