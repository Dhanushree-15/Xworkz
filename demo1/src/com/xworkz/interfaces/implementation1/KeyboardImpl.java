package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IKeyboard;

public class KeyboardImpl implements IKeyboard {
    public void type() { System.out.println("KeyboardImpl - type"); }
    public void connect() { System.out.println("KeyboardImpl - connect"); }
    public void lightOn() { System.out.println("KeyboardImpl - lightOn"); }

    public void setAngle() {
        System.out.println("To set drill angle.");
    }

}