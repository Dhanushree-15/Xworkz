package com.xworkz.inheritence.internal.money;

public class Dollar extends Currency {
    public Dollar() {
        super();
        System.out.println("Running non-arg constructor Dollar--child");
    }

    @Override
    public void value() {
        System.out.println("Dollar is a strong currency--child");
    }

    @Override
    public void rate() {
        System.out.println("Dollar's exchange rate varies--child");
    }

    @Override
    public void symbol() {
        System.out.println("Dollar symbol is $--child");
    }

    @Override
    public void usage() {
        System.out.println("Dollar is used globally--child");
    }
    public void globalReserve() {
        System.out.println("Dollar is the most widely held reserve currency --child");
    }

}
