package com.xworkz.Abstrc.Internal;

public class AlarmImpl implements Alarm {
    @Override
    public void ring() {
        System.out.println("ring is executed in AlarmImpl");
    }
}
