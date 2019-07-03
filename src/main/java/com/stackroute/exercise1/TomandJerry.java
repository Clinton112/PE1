/*
 Write a program which accepts an integer number as input from the user and perform the
 following conditional checks:
 a. Print Tom if number is odd and exists between 20 to 30
 b. Print Jerry, if number is even and exists between 20 and 30
 */
package com.company;
import java.util.*;
public class TomandJerry
{
    public String tomandjerry(int number)//checks input is number and in specified range and even or odd
    {

        if(!(number<'0' && number>'9'))//number or not
        {

            if(number>=20 && number <=30)//in range or not
            {
                if(number %2==0)//even or not
                {
                    return("JERRY");
                }
                else
                {
                    return("TOM");
                }

            }
            else
            {
                return("Wrong input");
            }
        }
        else
        {
            return "Input is Character";
        }

    }
}
