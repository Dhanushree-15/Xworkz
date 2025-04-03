package com.xworkz.inheritence.internal.Chair;

public class ChairRun {
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.material();
        chair.type();
        chair.adjustableHeight();
        chair.color();
        chair.hasArmrests();
        System.out.println("--------------");
        Chair chair1=new ChairDetails();
        chair1.material();
        chair1.type();
        chair1.adjustableHeight();
        chair1.hasArmrests();
        chair1.color();
    }
}
