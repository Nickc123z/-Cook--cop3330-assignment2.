/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Nick Cook
 */


import java.util.*;
import java.lang.*;


class E32
{
    public static void main (String[] args) {

            System.out.println("Let's play Guess the Number!");
            int num;
            int guess;
            int total = 0;
            int num1;
            num = (int) (Math.random() * 999 + 1);
            Scanner scan = new Scanner(System.in);

            while(num != 0){

                System.out.print("Enter the difficulty level(1, 2, or  3): ");
                num1 = scan.nextInt();
                if(num1 == 1)
                    num = (int) (Math.random() * 10 + 1);
                else if(num1 == 2)
                    num = (int) (Math.random() * 100 + 1);
                else
                    num = (int) (Math.random() * 1000 + 1);

                System.out.print("I have my number. What's your guess?: ");
                do{
                     guess = scan.nextInt();
                    total++;
                    if (guess == num){
                        System.out.println("You got it in "+total+"  guesses!");
                    }
                    else if (guess < num)
                        System.out.println("Too low. Guess again: ");
                    else if (guess > num)
                        System.out.println("Too high. Guess again: ");

                }while (guess != num);

                System.out.print("\nDo you wish to play again (Y/N)?  ");
                char c = scan.next().charAt(0);
                if(c=='N' || c=='n')
                    break;
            }



        }
    }