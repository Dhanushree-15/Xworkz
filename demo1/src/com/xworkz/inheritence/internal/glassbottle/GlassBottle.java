package com.xworkz.inheritence.internal.glassbottle;

public class GlassBottle {
    public GlassBottle() {
        System.out.println("Running non-arg constructor Bottle--parent");
    }
    public void fill() {
        System.out.println("GlassBottle is filled with liquid--parent");
    }
    public void storeWater() {
        System.out.println("GlassBottle stores water--parent");
    }
    public void storeMilk() {
        System.out.println("GlassBottle stores milk--parent");
    }
    public void madeOfGlass() {
        System.out.println("Some GlassBottle are made of glass--parent");
    }
    public void frozen() {
        System.out.println("GlassBottle can be frozen--parent");
    }
}
