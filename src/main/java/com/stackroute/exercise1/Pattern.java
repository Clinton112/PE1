/*
 Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6
 6 6 . . . nth iteration.
 Input: 5
 Output : 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
 */


package com.company;
import java.util.*;//java.util package
public class Pattern
{

    public String pattern(int num)//print pattern
    {
        String str="";//string initialized
        for (int loop01=1;loop01<=num;loop01++)//outer loop started
        {
            for(int loop02=1;loop02<=loop01;loop02++)//inner loop started
            {
                str=str+loop01+" ";//operation

            }
        }return str;//returns the value
    }
}
