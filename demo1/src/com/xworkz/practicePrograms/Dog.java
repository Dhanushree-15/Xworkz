package com.xworkz.practicePrograms;

import java.util.Arrays;

public class Dog {
    public static void main(String[] args) {
        int[] arr = {7, 54, 5, 9, 4, 21, 6, 1, 3, 8};
        System.out.print("Array elements are: ");
        for(int nor:arr){
            System.out.print(nor+" ");
        }
        System.out.println();
        int asc;
        Arrays.sort(arr);
        System.out.print("Sorted array is: ");
        for (int num : arr) {
            System.out.print(num+" ");
        }
    }
}
