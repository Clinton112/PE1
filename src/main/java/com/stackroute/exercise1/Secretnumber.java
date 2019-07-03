/*
 Write a program which accepts a number from user as input (set the limit say 1 - 50 or 1 -
 100) User should guess until the the target number is guessed correctly.
 Print separate messages for the following:
 a. Number guessed is more than original number
 b. Number guessed is less than original number
 c. Number guessed matches the original number
 */
package com.company;
import java.util.*;
public class Secretnumber
{
    public static void main(String[] args)
    {

        int secretNumber;//initialized secret number
        secretNumber=(int)(Math.random()*99+1);//creating random number here
        Scanner keyboard=new Scanner(System.in);//taking input from scanner
        int guess;//guess variable
        do
            {
                System.out.print("Enter a guess ");//take a guess
                guess=keyboard.nextInt();//input from scanner
                if (guess ==secretNumber)//if values are same
                {
                    System.out.println("Your guess is correct congratulations !!");//return value
                }
                else if (guess<secretNumber)//if guess<secretNumber
                {
                    System.out.println("Your guess is smaller than the secret number");//return value
                }
                else if (guess>secretNumber)//if guess>secretNumber
                {
                    System.out.println("Your guess is greater than the secret number");//return value
                }
            } while (guess!=secretNumber);//while condition
    }
}
