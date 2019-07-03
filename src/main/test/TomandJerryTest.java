package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TomandJerryTest
{
    TomandJerry object;
    @Before
    public void setUp() throws Exception
    {
        System.out.println("before");
        object=new TomandJerry();
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("after");
        object=null;
    }
    @Test
    public void checkevenandrange()
    {
        String result=object.tomandjerry(25);
        assertEquals("TOM",result);
    }
    @Test
    public void checkanotherevenandrange()
    {
        String result=object.tomandjerry(28);
        assertEquals("JERRY",result);
    }
    @Test
    public void checklastevenandrange()
    {
        String result=object.tomandjerry(4);
        assertEquals("Wrong input",result);
    }
   /* @Test
    public void checknotnumber()
    {
        String result=object.tomandjerry(13);
        assertEquals("Input is Character",result);
    }*/

}