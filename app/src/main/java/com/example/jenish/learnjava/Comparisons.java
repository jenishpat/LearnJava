package com.example.jenish.learnjava;

/**
 * Created by JENISH on 5/28/2017.
 */

public class Comparisons {
    public static void main(String[] args) {
        int value = 4;

        for (int i = 0; i < 8; i++) {
            if (i == value){
                System.out.println(i + " is equal to " + value);
            }
            if (i < value) {
                System.out.println(i + " is less than equal to " + value);
            }
            if (i > value) {
                System.out.println(i + " is greater than equal to " + value);
            }
        }
        System.out.println(4 != value);
        System.out.println(5 != value);

        String greeting = "Hi Jenish";
        String greeting2 = "Hi";
        greeting2 = greeting2 + " Jenish";
        System.out.println(greeting);
        System.out.println(greeting2);
        System.out.println(greeting.equals(greeting2));
    }
}