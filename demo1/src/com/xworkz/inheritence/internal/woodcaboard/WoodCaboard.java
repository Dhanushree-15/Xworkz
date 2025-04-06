package com.xworkz.inheritence.internal.woodcaboard;

public class WoodCaboard {
    public WoodCaboard() {
        System.out.println("Running non-arg constructor WoodCaboard--parent");
    }
    public void lock() {
        System.out.println("WoodCaboard has a lock--parent");
    }
    public void key() {
        System.out.println("WoodCaboard has a key--parent");
    }
    public void handle() {
        System.out.println("WoodCaboard has a handle--parent");
    }
    public void open() {
        System.out.println("WoodCaboard can be opened--parent");
    }
    public void close() {
        System.out.println("WoodCaboard can be closed--parent");
    }
}
