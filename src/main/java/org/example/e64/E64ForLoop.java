package org.example.e64;

import java.util.Scanner;

public class E64ForLoop {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner input= new Scanner(System.in);
        System.out.print("Int: ");
        int n = input.nextInt();


        // Prompt the user to enter a value for end


        // Use a for loop that starts with i = 0 and continues while i < 2 * end
        // Inside the loop, print the value of i followed by a space


        // Step 1: Create a Scanner object to read input from the console
         for(int i = 0; i < 2 *n; i++){
             System.out.print(i+" ");
         }

    }
}
