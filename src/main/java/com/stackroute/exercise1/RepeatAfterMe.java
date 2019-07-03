/*
 Write a program for the following condition:
 Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should
 repeat n number of times in the output String.
 Input1: Stackroute
 Input2: 5
 Output1: Stackrouterouterouterouterouteroute

 Input1: Stackroute
 Input2: 2
 Output1: Stackroutetete
 */
package com.company;
import java.util.*;
public class RepeatAfterMe
{
    public String repeat(String inputString,int substringcopy)
    {
        int position=inputString.length()-substringcopy;
        String repeat_set=inputString.substring(position,inputString.length());
        for (int i=1;i<=substringcopy;i++)
        {
            inputString=inputString+repeat_set;
        }
        return inputString;
    }
}
