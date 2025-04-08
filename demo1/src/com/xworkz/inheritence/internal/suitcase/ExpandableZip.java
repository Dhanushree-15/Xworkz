package com.xworkz.inheritence.internal.suitcase;

public class ExpandableZip extends Zip {
    public ExpandableZip() {
        super();
        System.out.println("ExpandableZip --grandchild");
    }

    public void expandStorage() {
        System.out.println("ExpandableZip expands storage space when needed --grandchild method");
    }
}