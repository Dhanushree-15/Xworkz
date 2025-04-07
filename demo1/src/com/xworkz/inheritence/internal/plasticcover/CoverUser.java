package com.xworkz.inheritence.internal.plasticcover;

public class CoverUser {
    public void use(PlasticCover cover) {
        cover.protect();
        cover.design();
        cover.grip();
        cover.waterproof();
        cover.enhance();

        if (cover instanceof BookCover) {
            System.out.println("cover is instance of BookCover");
            BookCover book = (BookCover) cover;
            book.reusable();
        }
    }
}
