package com.xworkz.inheritence.internal.panipuri;

public class PanipuriUser {
    public void enjoy(Panipuri panipuri) {
        panipuri.street();
        panipuri.crispy();
        panipuri.variety();
        panipuri.filling();
        panipuri.fresh();

        if (panipuri instanceof SpicyPanipuri) {
            System.out.println("panipuri is instance of SpicyPanipuri");
            SpicyPanipuri spicy = (SpicyPanipuri) panipuri;
            spicy.serve();
        }
    }
}
