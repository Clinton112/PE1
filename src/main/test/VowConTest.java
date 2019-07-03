package com.company;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class VowConTest
{
    VowCon object;
    @Before
    public void setUp() throws Exception
    {
        System.out.println("Before");
        object=new VowCon();
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("After");
        object=null;
    }
    public void checkvowel()
    {
        String result=object.vowelconsonant("a");
        assertEquals("Vowel",result);
    }
    public void checkconsonant()
    {
        String result=object.vowelconsonant("b");
        assertEquals("Consonant",result);
    }
}