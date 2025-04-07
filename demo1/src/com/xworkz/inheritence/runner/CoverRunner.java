package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.plasticcover.PlasticCover;
import com.xworkz.inheritence.internal.plasticcover.BookCover;
import com.xworkz.inheritence.internal.plasticcover.CoverUser;

public class CoverRunner {
    public static void main(String[] args) {
        PlasticCover cover = new PlasticCover();
        cover.protect();
        cover.design();
        cover.grip();
        cover.waterproof();
        cover.enhance();

        System.out.println("-----------");

        PlasticCover cover2 = new BookCover();
        cover2.protect();
        cover2.design();
        cover2.grip();
        cover2.waterproof();
        cover2.enhance();

        System.out.println("-----------");

        BookCover bookCover = new BookCover();
        bookCover.protect();
        bookCover.design();
        bookCover.grip();
        bookCover.waterproof();
        bookCover.enhance();
        bookCover.reusable();

        System.out.println("-----------");

        CoverUser user = new CoverUser();
        user.use(cover);
        user.use(cover2);
        user.use(bookCover);
    }
}
