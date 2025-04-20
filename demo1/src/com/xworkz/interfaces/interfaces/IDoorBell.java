package com.xworkz.interfaces.interfaces;

public interface IDoorBell {
    void ring();
    void recordVisitor();
    void notifyUser();

    default void chipPaint() {
        System.out.println("To chip away old paint.");
    }

}