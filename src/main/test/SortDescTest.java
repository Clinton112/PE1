package com.company;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortDescTest {
    SortDesc ob;
    @Before
    public void setUp() throws Exception {
        ob=new SortDesc();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }

    @Test
    public void returnSortedNumber() {
        String result=ob.sortNumber(123);
        assertEquals("321\n\nSum of Even numbers is 2\nfalse",result);
    }
    @Test
    public void returnSortedNumber2() {
        String result=ob.sortNumber(8938);
        assertEquals("9883\n\nSum of Even numbers is 16\ntrue",result);
    }
}