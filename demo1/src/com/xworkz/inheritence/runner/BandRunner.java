package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.drumband.DrumBand;
import com.xworkz.inheritence.internal.drumband.RubberBand;

public class BandRunner {
    public static void main(String[] args) {
        DrumBand band1 = new DrumBand();
        band1.bind();
        band1.stretch();
        band1.size();
        band1.material();
        band1.use();

        System.out.println("-------------------");
        DrumBand band = new RubberBand();
        band.bind();
        band.stretch();
        band.size();
        band.material();
        band.use();

        System.out.println("-----------------");
        RubberBand rubberBand = new RubberBand();
        rubberBand.bind();
        rubberBand.stretch();
        rubberBand.size();
        rubberBand.material();
        rubberBand.use();
    }
}
