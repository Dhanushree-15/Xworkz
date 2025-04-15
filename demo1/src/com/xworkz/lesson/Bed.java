package com.xworkz.lesson;

public class Bed {
    private int bedId;
    private String bedType;
    private double length;

    public Bed(int bedId, String bedType, double length) {
        this.bedId = bedId;
        this.bedType = bedType;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Bed [bedId=" + bedId + ", bedType=" + bedType + ", length=" + length + "]";
    }

    @Override
    public int hashCode() {
        return 97;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Bed) {
                System.out.println("ref is Bed, will compare...");
                Bed b1 = this;
                Bed b2 = (Bed) obj;

                if (b1.bedId == b2.bedId &&
                        b1.length == b2.length &&
                        (b1.bedType != null && b1.bedType.equals(b2.bedType))) {

                    System.out.println("both beds are same");
                    return true;
                }
            }
        }
        return false;
    }
}
