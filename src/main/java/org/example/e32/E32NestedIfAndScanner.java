package org.example.e32;

import java.util.Scanner;

public class E32NestedIfAndScanner {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);
        // Print prompt for user to enter gender
        System.out.println("Please enter your gender: M or F");
        // Capture the gender input
        char gender = input.next().charAt(0);

        // Print prompt for user to enter age
        System.out.println("Please enter your age");
        // Capture the age input
        int age = input.nextInt();


        if (age > 25) {
            if (gender == 'F') {
                System.out.println("Woman");
            }else {
                System.out.println("Man");
            }
        }

            else if (gender == 'F') {
                System.out.println("Girl");

            }else {
                System.out.println("Boy");
            }
        }
    }

