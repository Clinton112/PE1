/*Write a program which accepts an integer number as input from the user and perform the
following conditional checks:
a. Print Tom if number is odd and exists between 20 to 30
b. Print Jerry, if number is even and exists between 20 and 30
* */
package com.company;

import java.util.Scanner;

public class Palindrome
{
    public String palindrome(int num)//check for paindrome
    {

        if(num<0)//check for negative number
        {
            return "Negative Number";//return the value
        }
        else
        {
            String num1=Integer.toString(num);//integer to string
            StringBuffer num2=new StringBuffer();//stringbuffer object created
            num2.append(num1);//append string to stringbuffer
            num2=num2.reverse();//reverse the number
            int revnum=Integer.parseInt(num2.toString());//string to integer
            int ornum=Integer.parseInt(num1.toString());//string to number
            if(revnum==ornum)//checks a condition
            {
                int sum=0;//initialized to zero
                while (revnum!=0)//while loop starts here
                {
                    if((revnum%10)%2==0)//checks the condition
                    {
                        sum=sum+revnum%10;//operation
                    }
                    revnum=revnum/10;//division
                }
                if(sum>25)//checks the condition and return corresponding values
                {
                    return "It is palindrome and the sum of even numbers is greater than 25";
                }
                else
                {
                    return "It is palindrome and the sum of even numbers is less than 25";
                }
            }
            else
            {
                return "It is not palindrome";
            }
        }

    }
}
