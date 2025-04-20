package com.xworkz.interfaces.interfaces;

public interface IOven {
    void preheat();
    void bake();
    void grill();

    default void testDrill() {
        System.out.println("To test drill on scrap piece.");
    }

}