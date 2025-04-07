package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.plasticcover.PlasticCover;
import com.xworkz.inheritence.internal.plasticcover.BookCover;

public class CoverRunner {
    public static void main(String[] args) {
        PlasticCover cover1 = new PlasticCover();
        cover1.protect();
        cover1.design();
        cover1.grip();
        cover1.waterproof();
        cover1.enhance();

        System.out.println("-----------");

        PlasticCover cover = new BookCover();
        cover.protect();
        cover.design();
        cover.grip();
        cover.waterproof();
        cover.enhance();

        System.out.println("-----------");

        BookCover bookCover = new BookCover();
        bookCover.protect();
        bookCover.design();
        bookCover.grip();
        bookCover.waterproof();
        bookCover.enhance();
    }
}
