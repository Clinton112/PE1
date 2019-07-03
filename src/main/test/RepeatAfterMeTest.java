package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RepeatAfterMeTest
{
    RepeatAfterMe object;
    @Before
    public void setUp() throws Exception
    {
        System.out.println("before");
        object=new RepeatAfterMe();
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("after");
        object=null;
    }
    @Test
    public void checkrepeat()
    {
        String result=object.repeat("Harry",2);
        assertEquals("Harryryry",result);
    }

    @Test
    public void secondcheckrepeat()
    {
        String result=object.repeat("Cuttack",3);
        assertEquals("Cuttackackackack",result);
    }

    @Test
    public void thirdcheckrepeat()
    {
        String result=object.repeat("Fasttrack",5);
        assertEquals("Fasttracktracktracktracktracktrack",result);
    }
}