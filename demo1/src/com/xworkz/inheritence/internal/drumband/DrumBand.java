package com.xworkz.inheritence.internal.drumband;

public class DrumBand {
    public DrumBand() {
        System.out.println("Running non-arg constructor Band--parent");
    }
    public void bind() {
        System.out.println("DrumBand is used for binding--parent");
    }
    public void stretch() {
        System.out.println("DrumBand can stretch--parent");
    }
    public void size() {
        System.out.println("DrumBand comes in different sizes--parent");
    }
    public void material() {
        System.out.println("DrumBand is made of elastic material--parent");
    }
    public void use() {
        System.out.println("DrumBand has many uses--parent");
    }
}
