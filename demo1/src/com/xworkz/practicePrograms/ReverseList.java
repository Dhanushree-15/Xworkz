package com.xworkz.practicePrograms;

import java.util.*;

public class ReverseList {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Collections.reverse(list);
        System.out.println(list); // [5, 4, 3, 2, 1]
    }
}
