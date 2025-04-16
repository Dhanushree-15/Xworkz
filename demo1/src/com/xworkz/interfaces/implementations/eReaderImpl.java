package com.xworkz.interfaces.implementations;

import com.xworkz.interfaces.interfaces.IeReader;

public class eReaderImpl implements IeReader {
    public void openBook() { System.out.println("eReaderImpl - openBook"); }
    public void turnPage() { System.out.println("eReaderImpl - turnPage"); }
    public void bookmarkPage() { System.out.println("eReaderImpl - bookmarkPage"); }
}
