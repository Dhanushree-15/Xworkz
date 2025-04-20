package com.xworkz.interfaces.interfaces;

public interface IeReader {
    void openBook();
    void turnPage();
    void bookmarkPage();

    default void cleanDust() {
        System.out.println("To clean dust after drilling.");
    }

}