package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IeReader;

public class eReaderImpl implements IeReader {
    public void openBook() { System.out.println("eReaderImpl - openBook"); }
    public void turnPage() { System.out.println("eReaderImpl - turnPage"); }
    public void bookmarkPage() { System.out.println("eReaderImpl - bookmarkPage"); }

    public void cleanDust() {
        System.out.println("To clean dust after drilling.");
    }

}