package com.xworkz.electric;

public class Projector {
    Lens lens;
    Lamp lamp;

    Projector(Lens lens, Lamp lamp) {
        this.lens = lens;
        this.lamp = lamp;
    }

    void displayInfo() {
        System.out.println("Projector with " + lens.type + " lens and " + lamp.wattage + "W lamp.");
    }

}
