
package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.*;
public class SmartMirrorImpl implements ISmartMirror {
    public void displayWeather() { System.out.println("SmartMirrorImpl - displayWeather"); }
    public void showTime() { System.out.println("SmartMirrorImpl - showTime"); }
    public void adjustBrightness() { System.out.println("SmartMirrorImpl - adjustBrightness"); }
}
