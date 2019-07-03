package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversewithoutLoopsTest
{
    ReversewithoutLoops object;
    @Before
    public void setUp() throws Exception
    {
        System.out.println("before");
        object=new ReversewithoutLoops();
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("after");
        object=null;
    }
    @Test
    public void reversecheck()
    {
        String result=object.reversewithoutloops("Hello");
        assertEquals("olleH",result);
    }
}