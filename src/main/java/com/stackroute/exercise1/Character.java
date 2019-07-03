/*Write a program which accepts a number as input and check whether the given number is
  palindrome or not If it is a palindrome then
  a. Add all the even numbers and check whether the sum is more than 25.
  b. Print success and failure messages for all 3 conditions
  Input : 2468642
  Output : 2468642 is palindrome and the sum of even numbers is greater than 25
  Input: 12345
  Output: 12345 is not palindrome
  Input: 12345654321
  Output : 12345654321 is palindrome and sum of even numbers is less than 25*/

package com.company;
import java.util.*; //Contains the collections framework, legacy collection classes,etc
import java.io.BufferedReader; //for buffered reader
import java.io.IOException; //input output exception
import java.io.InputStreamReader; //for inputstream reader
public class Character
{
    public String charactercheck(char variable)//check variable is caps small integer
    {
        if(variable >= 'a' && variable <= 'z')//check for small letter
        {
            return("It's Small Letters");//return the value
        }
        else if(variable >= 'A' && variable <= 'Z')//check for capital letter
        {
            return("It's Capital Letters");//return the value
        }
        else if(variable >= '0' && variable <= '9')//check for digits
        {
            return("It's a Digit");//return the value
        }
        else
        {
            return("It is a special character");//return characters other than digits lowercase and upercase
        }
    }
}
