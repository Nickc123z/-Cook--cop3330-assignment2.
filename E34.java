/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nick Cook
 */


import java.util.*;
import java.lang.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class E34
{


        public static void main(String[] args) {
            ArrayList<String> employees = new ArrayList<String>(Arrays.asList("John Smith","Jackie Jackson","Chris Jones","Amanda Cullen","Jeremy Goodwin"));
            printEmployees(employees);

            Scanner scan = new Scanner(System.in);

            System.out.println();
            System.out.println("Enter an employee name to remove: ");
            String Remove = scan.nextLine();

            employees.remove(Remove);

            System.out.println();
            printEmployees(employees);
        }

        public static void printEmployees(ArrayList<String> employees) {
            System.out.println("There are "+employees.size()+" employees: ");
            for(String emp:employees) {
                System.out.println(emp);
            }
        }
    }