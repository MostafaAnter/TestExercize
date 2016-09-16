package com.mostafa_anter.testexercizee;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;


/**
 * Created by mostafa_anter on 9/16/16.
 */
public class SimpleUnitTest {
    @Test
    public void testArithmetic() throws Exception{
        assertEquals("hello",2+2, 5);
    }

    @Test
    public void testString(){
        assertThat("mostafa", equalTo("mosafa"));
    }
}
