package com.matrix.nikhil.program;

import java.util.Scanner;


public class StringWovels {
    public static void main(String[] args) {
        // Declare a variables
        String str = null;

        Scanner sc = new Scanner(System.in);
        // Accept any string from user
        System.out.print("Enter any String: ");
        str = sc.nextLine();
        // Convert String to lower case letter
        str = str.toLowerCase();

        // Print all vowels
        System.out.print("Vowels in the given String are:");
        // For loop to iterate String
        for (int i = 0; i < str.length(); i++) {
            // Check a character is vowel or not
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                // Display each vowel
                System.out.print(" " + str.charAt(i));
            }
        }

    }

}

