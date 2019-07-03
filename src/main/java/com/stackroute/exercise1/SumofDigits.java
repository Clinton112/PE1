/*
 Write a program that reads an unspecified number of integer arguments using Scanner Class
 and adds them together. The program should display total of the given input number and should
 only consider integer value.The program should display an error message if there are any non
 integer values
 Input : 12 23 2 4
 Output : 41
 */
package com.company;

import java.util.Scanner;
import java.lang.*;
public class SumofDigits
{
    public String addNum(String input)//checks whether character is number or other than number if number then sum it
    {
        String[] listOfNum1=input.split(" ");//splits string to array
        int sum=0,k=0;
        for(int i=0;i<listOfNum1.length;i++)//loop starts here
        {
            if(java.lang.Character.isLetter(listOfNum1[i].charAt(0)))//is not a number
            {
                k=1;
                return ("Character found");
                //break;
            }
            else if(listOfNum1[i].charAt(0)>='0'&& listOfNum1[i].charAt(0)<='9'){//Checking for any instance of Number
                sum=sum+Integer.parseInt(listOfNum1[i]);

            }
            else
                {//Checking for
                    k=1;
                    return ("Special Character found");
                        //break;
                }
        }
        if(k==0)
            return ("Sum is "+sum);
        else
            return null;
    }

}
