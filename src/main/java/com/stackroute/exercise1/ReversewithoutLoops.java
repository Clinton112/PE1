/*
 Write a program to reverse any string without using String Buffer.
 Input : london
 Output : nodnol
 */
package com.company;
import java.util.*;
public class ReversewithoutLoops
{
    public String reversewithoutloops(String original)//reverse without buffer
    {
        String reverse="";//initialized reverse
        int length=original.length();//length of string
        for (int loop=length-1;loop>=0;loop--)//loop starts here
        {
            reverse=reverse+original.charAt(loop);//condition
        }
        return ("Reverse of original String without String buffer is "+reverse);//return the value
    }
}
