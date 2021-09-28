/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nick Cook
 */


import java.util.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class E35
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String names;
        ArrayList<String> List = new ArrayList<String>();

        do {
            System.out.println("Enter a name:");
            names = input.nextLine();

            if(!names.isBlank() && !names.isEmpty())
                List.add(names);
        }while(!names.isBlank() && !names.isEmpty());


        Random news = new Random();
        int randomName = news.nextInt(List.size());


        System.out.println("The winner is... "+List.get(randomName));

    }
    }

