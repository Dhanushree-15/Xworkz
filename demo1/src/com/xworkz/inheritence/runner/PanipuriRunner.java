package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.panipuri.Panipuri;
import com.xworkz.inheritence.internal.panipuri.SpicyPanipuri;
import com.xworkz.inheritence.internal.panipuri.PanipuriUser;

public class PanipuriRunner {
    public static void main(String[] args) {
        Panipuri panipuri = new Panipuri();
        panipuri.street();
        panipuri.crispy();
        panipuri.variety();
        panipuri.filling();
        panipuri.fresh();

        System.out.println("-----------");

        Panipuri panipuri2 = new SpicyPanipuri();
        panipuri2.street();
        panipuri2.crispy();
        panipuri2.variety();
        panipuri2.filling();
        panipuri2.fresh();

        System.out.println("-----------");

        SpicyPanipuri spicyPanipuri = new SpicyPanipuri();
        spicyPanipuri.street();
        spicyPanipuri.crispy();
        spicyPanipuri.variety();
        spicyPanipuri.filling();
        spicyPanipuri.fresh();
        spicyPanipuri.serve();

        System.out.println("------casting------");

        PanipuriUser user = new PanipuriUser();
        user.enjoy(panipuri);
        user.enjoy(panipuri2);
        user.enjoy(spicyPanipuri);
    }
}
