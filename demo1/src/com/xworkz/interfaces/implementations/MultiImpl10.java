package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.*;

public class MultiImpl10 implements ISpeaker, IAirConditioner, IMicrowave, IRefrigerator, IWashingMachine {
    public void playMusic() { System.out.println("MultiImpl10 - playMusic"); }
    public void pause() { System.out.println("MultiImpl10 - pause"); }
    public void increaseVolume() { System.out.println("MultiImpl10 - increaseVolume"); }
    public void turnOn() { System.out.println("MultiImpl10 - turnOn"); }
    public void turnOff() { System.out.println("MultiImpl10 - turnOff"); }
    public void setTemperature() { System.out.println("MultiImpl10 - setTemperature"); }
    public void start() { System.out.println("MultiImpl10 - start"); }
    public void stop() { System.out.println("MultiImpl10 - stop"); }
    public void setTimer() { System.out.println("MultiImpl10 - setTimer"); }
    public void cool() { System.out.println("MultiImpl10 - cool"); }
    public void freeze() { System.out.println("MultiImpl10 - freeze"); }
    public void defrost() { System.out.println("MultiImpl10 - defrost"); }
    public void wash() { System.out.println("MultiImpl10 - wash"); }
    public void rinse() { System.out.println("MultiImpl10 - rinse"); }
    public void spin() { System.out.println("MultiImpl10 - spin"); }
}
