package com.platzi.javatests.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilTest {
    public static void main(String[] args) {

        String result = StringUtil.repeat("hola",3);
        assertEquals(result,"holaholahola");


        String result2 = StringUtil.repeat("hola",1);
        if (!result2.equals("hola"))
            throw new RuntimeException("Error is received "+result2+ " but it should be hola");
    }

    /*@Test
    public void repeat_string_once() {
        Assert.assertEquals("hola", StringUtil.repeat("hola", 1));
    }

    @Test
    public void repeat_string_multiple_times() {
        Assert.assertEquals("holaholahola", StringUtil.repeat("hola", 3));
    }

    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("hola", 0));
    }

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        StringUtil.repeat("hola", -1);
    }*/
}