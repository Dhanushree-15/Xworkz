package com.xworkz.inheritence.internal.metal;

public class Jeweller {
    public void use(Metal metal) {
        metal.conduct();
        metal.durable();
        metal.malleable();
        metal.dense();
        metal.resist();

        if (metal instanceof Gold) {
            System.out.println("metal is instance of Gold");
            Gold gold = (Gold) metal;
            gold.shine();
        }
    }
}
