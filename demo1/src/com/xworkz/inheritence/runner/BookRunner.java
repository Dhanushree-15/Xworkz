package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.ebook.Ebook;
import com.xworkz.inheritence.internal.ebook.Novel;

public class BookRunner {
    public static void main(String[] args) {
        System.out.println("---------- Book ----------");
        Ebook book = new Ebook();
        book.read();
        book.write();
        book.publish();
        book.genre();
        book.pages();

        System.out.println("---------- Novel ----------");
        Ebook novel = new Novel();
        novel.read();
        novel.write();
        novel.publish();
        novel.genre();
        novel.pages();

        System.out.println("---------- Direct Novel ----------");
        Novel directNovel = new Novel();
        directNovel.read();
        directNovel.write();
        directNovel.publish();
        directNovel.genre();
        directNovel.pages();
    }
}
