package org.example.e68;

public class E68Arrays {
    public static void main(String[] args) {
        // Create an array of characters and store the values 's', 'a', 'y', 'b', 'n', 'c', 't', 'd', 'a', 'e', 'x'


        // Print the characters at the indices that form the word "syntax"

        char [] names = {'s','a','y','b','n','c','t','d','a','e','x'};

        for (int i = 0; i < names.length; i= i+2){
            System.out.print(names[i]);
        }


    }
}
