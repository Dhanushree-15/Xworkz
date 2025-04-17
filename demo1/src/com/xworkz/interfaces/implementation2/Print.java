package com.xworkz.interfaces.implementation2;

import com.xworkz.interfaces.interfaces.IPrinter;
import com.xworkz.interfaces.interfaces.ISpeaker;

public class Print implements IPrinter, ISpeaker {
    public void print() { System.out.println("DualImpl9 - print"); }
    public void scan() { System.out.println("DualImpl9 - scan"); }
    public void copy() { System.out.println("DualImpl9 - copy"); }
    public void playMusic() { System.out.println("DualImpl9 - playMusic"); }
    public void pause() { System.out.println("DualImpl9 - pause"); }
    public void increaseVolume() { System.out.println("DualImpl9 - increaseVolume"); }
}
