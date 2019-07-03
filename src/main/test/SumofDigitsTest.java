package com.company;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class SumofDigitsTest {

    SumofDigits ob;
    @Before
    public void setUp() throws Exception {
        ob=new SumofDigits();
    }

    @After
    public void tearDown() throws Exception {
        ob=null;
    }
//"Character found",result
    //"Sum is 57",result
    //"Special Character found",result
    @Test
    public void returnMessageForAlphabetFound() {
        String result=ob.addNum("12 32 13 a");
        assertEquals("Character found",result);
    }
    @Test
    public void returnSumForDigits() {
        String result=ob.addNum("12 32 13");
        assertEquals("Sum is 57",result);
    }
    @Test
    public void returnmessageForSpecialCharacter() {
        String result=ob.addNum("12 32 13 ;");
        assertEquals("Special Character found",result);
    }
}