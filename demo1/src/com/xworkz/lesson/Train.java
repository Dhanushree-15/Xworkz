package com.xworkz.lesson;

public class Train {
    private int numberOfCoaches;   // Number of coaches in the train
    private String routeName;      // Name of the route or train
    private double speed;          // Average speed of the train in km/h

    public Train(int numberOfCoaches, String routeName, double speed) {
        this.numberOfCoaches = numberOfCoaches;
        this.routeName = routeName;
        this.speed = speed;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Train) {
                System.out.println("Ref is Train, will compare...");
                Train other = (Train) obj;
                if ((this.numberOfCoaches == other.numberOfCoaches) &&
                (this.routeName != null && this.routeName.equals(other.routeName)) &&
                (this.speed == other.speed)) {
                    System.out.println("Both trains are same");
                    return true;
                }
            }
        }
        return false;
    }
    @Override
    public String toString() {
        return "Train [numberOfCoaches=" + numberOfCoaches + ", routeName=" + routeName + ", speed=" + speed + "]";
    }
    @Override
    public int hashCode(){
        return 14;
    }
}
