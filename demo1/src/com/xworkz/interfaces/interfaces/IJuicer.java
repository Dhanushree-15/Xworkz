package com.xworkz.interfaces.interfaces;

public interface IJuicer {
    void juiceFruit();
    void stop();
    void clean();

    default void drillTile() {
        System.out.println("To drill carefully on tiles.");
    }

}