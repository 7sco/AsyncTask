package com.example.franciscoandrade.asynctask;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by franciscoandrade on 12/6/17.
 */
public class ConvertUtilTest {




    @Test
    public void convertFahrenheitToCelsius() throws Exception {

        float input = 212;
        float output;
        float expected = 100;
        double delta= .1;

        ConvertUtil convertUtil = new ConvertUtil();
        output= convertUtil.convertFahrenheitToCelsius(input);


        assertEquals(expected, output, delta);

    }

    @Test
    public void convertCelsiusToFahrenheit() throws Exception {

        float input = 100;
        float output;
        float expected = 212;
        double delta= .1;

        ConvertUtil convertUtil = new ConvertUtil();
        output= convertUtil.convertCelsiusToFahrenheit(input);


        assertEquals(expected, output, delta);


    }

}