package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest
{
    Palindrome object;
    @Before
    public void setUp() throws Exception
    {
        System.out.println("Before");
        object=new Palindrome();
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("After");
        object=null;
    }
    @Test
    public void checkpalindrome()
    {
        String result=object.palindrome(123454321);
        assertEquals("It is palindrome and the sum of even numbers is less than 25",result);
    }
    @Test
    public void checksecondpalindrome()
    {
        String result=object.palindrome(12345);
        assertEquals("It is not palindrome",result);
    }
    @Test
    public void checkthirdpalindrome()
    {
        String result=object.palindrome(2468642);
        assertEquals("It is palindrome and the sum of even numbers is greater than 25",result);
    }
    @Test
    public void checknegative()
    {
        String result=object.palindrome(-12345);
        assertEquals("Negative Number",result);
    }
}