package com.company;
import org.junit.*;

import java.net.SocketOption;
import java.sql.SQLOutput;

import static org.junit.Assert.*;

public class CharacterTest {
    Character object;

    @Before
    public void setUp() throws Exception
    {
        System.out.println("Before");
        object=new Character();
    }

    @After
    public void tearDown() throws Exception
    {
        System.out.println("After Class");
        object=null;
    }
    @BeforeClass
    public static void setupBeforeClass()
    {
        System.out.println("Before Class");
    }
    @AfterClass
    public static void tearDownAfterClass()
    {
        System.out.println("After class");
    }

    @Test
    public void specialcharacter()
    {
        String result=object.charactercheck(';');
        assertEquals("It is a special character",result);
    }
    public void uppercase()
    {
        String result=object.charactercheck('A');
        assertEquals("It's Capital Letters",result);
    }
    public void lowercase()
    {
        String result=object.charactercheck('a');
        assertEquals("It's Small Letters",result);
    }
    public void digits()
    {
        String result=object.charactercheck('6');
        assertEquals("It's a Digit",result);
    }
}