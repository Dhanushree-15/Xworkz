package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.angrybird.AngryBird;
import com.xworkz.inheritence.internal.angrybird.Eagle;

public class BirdRunner {
    public static void main(String[] args) {
        System.out.println("---------- Bird ----------");
        AngryBird bird = new AngryBird();
        bird.fly();
        bird.feathers();
        bird.layEggs();
        bird.sound();
        bird.vision();

        System.out.println("---------- Eagle ----------");
        AngryBird eagle = new Eagle();
        eagle.fly();
        eagle.feathers();
        eagle.layEggs();
        eagle.sound();
        eagle.vision();

        System.out.println("---------- Direct Eagle ----------");
        Eagle directEagle = new Eagle();
        directEagle.fly();
        directEagle.feathers();
        directEagle.layEggs();
        directEagle.sound();
        directEagle.vision();
    }
}
