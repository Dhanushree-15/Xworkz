package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.color.Color;
import com.xworkz.inheritence.internal.color.Purple;

public class ColorRunner {
    public static void main(String[] args) {
        Color color1 = new Color();
        color1.display();
        color1.mix();
        color1.brighten();
        color1.fade();

        System.out.println("-----------");

        Color color = new Purple();
        color.display();
        color.mix();
        color.brighten();
        color.fade();

        System.out.println("-----------");

        Purple red = new Purple();
        red.display();
        red.mix();
        red.brighten();
        red.fade();
    }
}
