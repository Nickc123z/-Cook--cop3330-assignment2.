/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nick Cook
 */




import java.util.Scanner;
import java.util.regex.Pattern;





public class E27 {



    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first name: ");

        String first = input.nextLine();
        System.out.print("Enter the last name: ");

        String last = input.nextLine();
        System.out.print("Enter the ZIP code: ");

        String zip = input.nextLine();
        System.out.print("Enter the employee ID: ");
        String employeeID = input.nextLine();


        validateInput(first, last, zip, employeeID);

    }


    public static void validateInput(String firstName, String lastName, String zip, String employeeID) {

        boolean first = FName(firstName);

        boolean last = LName(lastName);

        boolean Flag1 = EID(employeeID);

        boolean Flag2 = ZipCode(zip);

        if (first && last && Flag1 && Flag2) {
            System.out.println("There were no errors found.");
        }
    }


    public static boolean FName(String firstName) {
        boolean status = true;
        if (firstName.length() < 2) {
            System.out.println("The first name must be at least 2 characters long.\n");
            status = false;
        }
        if (firstName.length() == 0) {
            System.out.println("The first name must be filled in.\n");
            status = false;
        }
        return status;
    }

    public static boolean LName(String lastName) {
        boolean status = true;

        if (lastName.length() < 2) {
            System.out.println("The last name must be at least 2 characters long.\n");
            status = false;
        }
        if (lastName.length() == 0) {
            System.out.println("The last name must be filled in.");
            status = false;
        }
        return status;
    }

    public static boolean ZipCode(String zip) {
        boolean status = true;
        try {
            int number = Integer.parseInt(zip);


            if (zip.length() != 5) {
                System.out.println("The zipcode must be a 5 digit number.\n");
                status = false;
            }
        } catch (Exception e) {
            System.out.println("The zipcode must be a 5 digit number.\n");
            status = false;
        }
        return status;
    }

    public static boolean EID(String employeeID) {
        String pattern = "[a-zA-Z]{2}[-]{1}[0-9]{4}";
        if (!Pattern.matches(pattern, employeeID)) {
            System.out.println("The employee ID must be in the format of AA-1234.\n");
            return false;
        }
        return true;
    }

}



