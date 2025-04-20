package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IBlender;

public class BlenderImpl implements IBlender {
    public void blend() { System.out.println("BlenderImpl - blend"); }
    public void pulse() { System.out.println("BlenderImpl - pulse"); }
    public void clean() { System.out.println("BlenderImpl - clean"); }

    public void mountTV() {
        System.out.println("To mount a television safely.");
    }

}