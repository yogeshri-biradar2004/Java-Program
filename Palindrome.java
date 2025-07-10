package com.java.Inheritance;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");
        String str = sc.next();

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        //.equal for object
        if (str.equalsIgnoreCase(rev)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}

//output
// Enter the string:
//  ram
// The string is not a palindrome.
