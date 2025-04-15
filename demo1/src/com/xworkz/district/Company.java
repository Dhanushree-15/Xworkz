package com.xworkz.district;

public class Company {
    String location;
    int numOfCompany;
    String compName;



    String[] education={"B.E","bca","MBBS","MD","MTech"};
    public Company(){
        for(String edu:education){
            System.out.println(edu);
        }

    }
}
