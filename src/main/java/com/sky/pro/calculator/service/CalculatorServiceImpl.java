package com.sky.pro.calculator.service;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService{
    @Override
    public String addition(int num1, int num2){
        int res = Integer.parseInt(String.valueOf(num1+num2));
        return num1+"+"+num2+"="+res;
    }
    @Override
    public String subtraction(int num1, int num2){
        int res = Integer.parseInt(String.valueOf(num1-num2));
        return num1 +"-"+num2+"="+res;
    }
    @Override
    public String division(int num1, int num2){
        if (num2 == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");}
        else {
            int res = Integer.parseInt(String.valueOf(num1/num2));
            return  num1+"/"+num2+"="+res;}
    }
    @Override
    public String multiplication (int num1, int num2){
        int res = Integer.parseInt(String.valueOf(num1*num2));
        return num1+"*"+num2+"="+res;
    }

}
