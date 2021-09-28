/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nick Cook
 */


import java.util.*;
import java.lang.*;


class E31
{
    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);

        Float HR;
        int age;
        int intensity = 55;

        HR = scan.nextFloat();
        age = scan.nextInt();

        System.out.println("Resting Pulse: " + HR + " Age: " + age);
        System.out.println("\n");

        System.out.println("Intensity   | Rate");
        System.out.println("------------|----------");

        while(intensity<96){
            float rate = (((220 - age) - HR) * intensity/100) + HR;
            System.out.println(intensity+"%         | "+Math.round(rate) +"bpm");
            intensity+=5;
        }
    }
}



