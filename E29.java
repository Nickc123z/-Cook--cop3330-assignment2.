/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nick Cook
 */


import java.util.*;
import java.lang.*;

class E29
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int value;
        while(true){
            System.out.print("What is the rate of return? ");
            value = scan.nextInt();
            if(value>=1 && value<=72){
                value = 72/value;
                System.out.println("it will take "+value+" year to double your initial investment");
                break;
            }
            else
            {
                System.out.println("Sorry this is not a valid input");
            }
        }
    }
}