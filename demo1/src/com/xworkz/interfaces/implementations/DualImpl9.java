package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.IPrinter;
import com.xworkz.interfaces.interfaces.ISpeaker;

public class DualImpl9 implements IPrinter, ISpeaker {
    public void print() { System.out.println("DualImpl9 - print"); }
    public void scan() { System.out.println("DualImpl9 - scan"); }
    public void copy() { System.out.println("DualImpl9 - copy"); }
    public void playMusic() { System.out.println("DualImpl9 - playMusic"); }
    public void pause() { System.out.println("DualImpl9 - pause"); }
    public void increaseVolume() { System.out.println("DualImpl9 - increaseVolume"); }
}
