package com.xworkz.Lesson;

public class Airplane {
    private int numberOfEngines;
    private String model;
    private double maxSpeed;

    public Airplane(int numberOfEngines, String model, double maxSpeed) {
        this.numberOfEngines = numberOfEngines;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "Airplane [numberOfEngines=" + numberOfEngines + ", model=" + model + ", maxSpeed=" + maxSpeed + "]";
    }
    @Override
    public int hashCode(){
        return 99;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Airplane) {
                System.out.println("ref is Airplane, will compare...");
                Airplane a1 = this;
                Airplane a2 = (Airplane) obj;

                if (a1.numberOfEngines == a2.numberOfEngines &&
                        a1.maxSpeed == a2.maxSpeed &&
                        (a1.model != null && a1.model.equals(a2.model))) {

                    System.out.println("both airplanes are same");
                    return true;
                }
            }
        }
        return false;
    }
}
