package com.xworkz.practicePrograms;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=153;
        int sum=0;

        while(num>0){
            int rem=num%10;
            int cube=rem*rem*rem;
            sum=sum+cube;
            num=num/10;
        }
        System.out.println(sum);
    }
}
