/*
 Create a program that accepts a word as input and checks for each single character letter in
 the word whether it is a consonant or vowel.
 Condition:
 a. Print an error message if the input is not a letter
 b. If the input having more than one letter, print the required output
 (Vowel or Consonant) for each letter
 Input : p
 Output : Consonant
 Input : ap
 Output : Vowel Consonant (should it be a - vowel, p - consonant)
 */

package com.company;
import java.lang.Character;
import java.util.*;
import java.lang.*;
public class VowCon
{
    public String vowelconsonant(String text)//checks for vowek consonant
    {
        int len=text.length();//length of text
        for (int i=0;i<len;i++)//loop starts here
        {
            if(Character.isLetter(text.charAt(i)))//if character is letter
            {
                if(text.charAt(i)=='a'||text.charAt(i)=='e'||text.charAt(i)=='i'||text.charAt(i)=='o'||text.charAt(i)=='u'
                            ||text.charAt(i)=='A'||text.charAt(i)=='E'||text.charAt(i)=='I'||text.charAt(i)=='O'||text.charAt(i)=='U')//condition for vowel both in upper case and lower case
                {
                    return("Vowel ");
                }
                else
                {
                    return("Consonant ");
                }
            }
        }
        return ("Special Character");
    }
}
