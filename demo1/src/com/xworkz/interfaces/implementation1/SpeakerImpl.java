package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;

public class SpeakerImpl implements ISpeaker {
    public void playMusic() { System.out.println("SpeakerImpl - playMusic"); }
    public void pause() { System.out.println("SpeakerImpl - pause"); }
    public void increaseVolume() { System.out.println("SpeakerImpl - increaseVolume"); }
}
