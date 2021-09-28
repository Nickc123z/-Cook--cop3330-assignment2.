/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nick Cook
 */





import java.util.*;
import java.lang.*;

class E28
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int count = 1;
        int sum = 0;
        int num;


        while(count <6){

            System.out.print("Enter the value: ");
            num = scan.nextInt();
            System.out.println(num);
            sum +=num;
            count++;
        }
        System.out.println("The total is " + sum);
    }
}