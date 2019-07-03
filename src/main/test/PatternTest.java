package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest
{
    Pattern object;
    @Before
    public void setUp() throws Exception
    {
        System.out.println("Before");
        object=new Pattern();
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("After");
        object=null;
    }
    @Test
    public void checkpattern()
    {
        String result=object.pattern(5);
        assertEquals("1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ",result);
    }
}