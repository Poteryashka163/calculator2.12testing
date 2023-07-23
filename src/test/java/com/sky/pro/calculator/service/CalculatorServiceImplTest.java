package com.sky.pro.calculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private final CalculatorServiceImpl out = new  CalculatorServiceImpl();

    @Test
    void addition1_success() {
       int num1=3;
       int num2=2;
       int res = 5;
       String expectedResult =num1+"+"+num2+"="+res;
       String actualResult =out.addition(num1,num2);
       assertEquals(expectedResult,actualResult);

    }
    @Test
    void addition2_success() {
        int num1=3;
        int num2=0;
        int res = 0;
        String expectedResult =num1+"+"+num2+"="+res;
        String actualResult =out.addition(num1,num2);
        assertEquals(expectedResult,actualResult);}

    @Test
    void subtraction1_success() {
        int num1 = 3;
        int num2 = 2;
        int res = 1;
        String expectedResult =num1+"-"+num2+"="+res;
        String actualResult =out.subtraction(num1,num2);
        assertEquals(expectedResult,actualResult);

    }
    @Test
    void subtraction2_success() {
        int num1 = 3;
        int num2 = 3;
        int res = 0;
        String expectedResult =num1+"-"+num2+"="+res;
        String actualResult =out.subtraction(num1,num2);
        assertEquals(expectedResult,actualResult);

    }

    @Test
    void division1_success() {
        int num1 = 6;
        int num2 = 2;
        int res = 3;
        String expectedResult =num1+"/"+num2+"="+res;
        String actualResult =out.division(num1,num2);
        assertEquals(expectedResult,actualResult);

    }
    @Test
    void division2_success() {
        int num1 = 6;
        int num2 = 0;
        String expectedResult ="На ноль делить нельзя!";
        Exception exception =assertThrows(IllegalArgumentException.class,() -> out.division(num1,num2));
        assertEquals(expectedResult,exception.getMessage());

    }

    @Test
    void multiplication1_success() {
        int num1 = 6;
        int num2 = 2;
        int res = 12;
        String expectedResult =num1+"*"+num2+"="+res;
        String actualResult =out.multiplication(num1,num2);
        assertEquals(expectedResult,actualResult);

    }
    @Test
    void multiplication2_success() {
        int num1 = 3;
        int num2 = 2;
        int res = 6;
        String expectedResult =num1+"*"+num2+"="+res;
        String actualResult =out.multiplication(num1,num2);
        assertEquals(expectedResult,actualResult);

    }
}