/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nick Cook
 */




import java.util.*;


public class E25 {


    public static void passwordValidator(String st)
    {
        int n = st.length();
        boolean dig = false;
        boolean low = false;
        boolean up = false;
        boolean unique = false;


        for (char i : st.toCharArray()) {
            if (Character.isLowerCase(i))
                low = true;
            if (Character.isUpperCase(i))
                up = true;
            if (Character.isDigit(i))
                dig = true;
        }



        if (dig && low || up && unique
                && (n >= 8))
            System.out.println("Very Strong");
        else if ((low || up || unique)
                && (n >= 8))
            System.out.println("Strong");
        else if((n < 8))
            System.out.print("Weak");
        else
            System.out.print("Very Weak");

    }

    public static void main(String[] args)
    {
        String st;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Password: ");
        st = scan.nextLine();
        passwordValidator(st);
    }


}



