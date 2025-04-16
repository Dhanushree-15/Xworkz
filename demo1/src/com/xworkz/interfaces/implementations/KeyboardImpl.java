package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.IKeyboard;

public class KeyboardImpl implements IKeyboard {
    public void type() { System.out.println("KeyboardImpl - type"); }
    public void connect() { System.out.println("KeyboardImpl - connect"); }
    public void lightOn() { System.out.println("KeyboardImpl - lightOn"); }
}
