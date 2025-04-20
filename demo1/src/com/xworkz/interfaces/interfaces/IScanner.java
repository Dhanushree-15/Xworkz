package com.xworkz.interfaces.interfaces;

public interface IScanner {
    void scanDocument();
    void scanImage();
    void preview();

    default void finishEdge() {
        System.out.println("To finish edges cleanly.");
    }

}