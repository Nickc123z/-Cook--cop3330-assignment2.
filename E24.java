/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nick Cook
 */

import java.util.*;

public class E24 {
    static boolean Anagram(String s1, String s2) {


        boolean ifAna = true;
        if (s1.length() != s2.length()) {
            ifAna = false;
        }
        if (ifAna)
            return true;
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");
        System.out.print("Enter the first string: ");
        String s1 = scan.nextLine();

        System.out.print("Enter the second string: ");
        String s2 = scan.nextLine();

        if (Anagram(s1, s2))
            System.out.println(s1 + " and " + s2 + " are anagrams");
        else
            System.out.println(s2 + " and " + s2 + " are not anagrams");


    }
}