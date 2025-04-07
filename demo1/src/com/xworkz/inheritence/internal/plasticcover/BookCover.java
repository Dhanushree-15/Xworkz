package com.xworkz.inheritence.internal.plasticcover;

public class BookCover extends PlasticCover {
    public BookCover() {
        super();
        System.out.println("Running non-arg constructor BookCover--child");
    }

    @Override
    public void protect() {
        System.out.println("Book covers protect pages--child");
    }

    @Override
    public void design() {
        System.out.println("Book covers have attractive designs--child");
    }

    @Override
    public void grip() {
        System.out.println("Book covers provide a good grip--child");
    }

    @Override
    public void waterproof() {
        System.out.println("Book covers can be waterproof--child");
    }

    @Override
    public void enhance() {
        System.out.println("Book covers enhance book's look--child");
    }

    public void reusable() {
        System.out.println("Book covers are reusable and eco-friendly--child");
    }
}
