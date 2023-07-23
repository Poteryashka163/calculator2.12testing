package com.sky.pro.calculator.service;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplParametrizedTest {
    private final CalculatorServiceImpl out= new CalculatorServiceImpl();

    public static Stream<Arguments> plusParams(){
        return Stream.of(
                Arguments.of(3,2,"3+2=5"),
                Arguments.of(5,1,"5+1=6"),
                Arguments.of(3,5,"3+5=8")
        );
    }
    public static Stream<Arguments> minusParams(){
        return Stream.of(
                Arguments.of(3,2,"3-2=1"),
                Arguments.of(7,2,"7-2=5"),
                Arguments.of(5,2,"5-2=3")
        );
    }
    public static Stream<Arguments> multiplicationParams(){
        return Stream.of(
                Arguments.of(3,2,"3*2=6"),
                Arguments.of(3,5,"3*5=15"),
                Arguments.of(5,2,"5*2=10")
        );
    }
    public static Stream<Arguments> divisionParams(){
        return Stream.of(
                Arguments.of(10,2,"10/2=5"),
                Arguments.of(6,2,"6/2=3"),
                Arguments.of(12,2,"12/2=6")
        );
    }
    @ParameterizedTest
    @MethodSource("plusParams")
    void addition(int num1,int num2,String expectedResult) {
        String actualResult=out.addition(num1,num2);
        assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @MethodSource("minusParams")
    void subtraction(int num1,int num2,String expectedResult) {
        String actualResult=out.subtraction(num1,num2);
        assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @MethodSource("divisionParams")
    void division (int num1,int num2,String expectedResult) {
        String actualResult=out.division(num1,num2);
        assertEquals(expectedResult,actualResult);
    }

    @ParameterizedTest
    @MethodSource("multiplicationParams")
    void multiplication(int num1,int num2,String expectedResult) {
        String actualResult=out.multiplication(num1,num2);
        assertEquals(expectedResult,actualResult);
    }
}