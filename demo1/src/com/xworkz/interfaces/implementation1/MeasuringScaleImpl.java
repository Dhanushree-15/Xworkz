package com.xworkz.interfaces.implementation1;

import com.xworkz.interfaces.interfaces.IMeasuringScale;

public class MeasuringScaleImpl implements IMeasuringScale {
    public void weigh() { System.out.println("MeasuringScaleImpl - weigh"); }
    public void tare() { System.out.println("MeasuringScaleImpl - tare"); }
    public void reset() { System.out.println("MeasuringScaleImpl - reset"); }

    public void pushLightly() {
        System.out.println("To apply light pressure.");
    }

}