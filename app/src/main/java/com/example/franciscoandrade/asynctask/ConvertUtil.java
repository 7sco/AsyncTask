package com.example.franciscoandrade.asynctask;

/**
 * Created by franciscoandrade on 12/6/17.
 */

public class ConvertUtil {

    //Convert To celsius
    public  float convertFahrenheitToCelsius(float fahrenheit){

        float result= ((fahrenheit-32) * 5 / 9);

        return result;

    }

    //Convert To fahrenheit
    public  float convertCelsiusToFahrenheit(float celsius){

        float result= ((celsius*9)/5)+32;

        return result;

    }






}
