package com.sky.pro.calculator.controller;

import com.sky.pro.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/calculator")
public class CalculatorController {
        private final CalculatorService calculatorService;
        public CalculatorController(CalculatorService calculatorService){
            this.calculatorService = calculatorService;
        }
        @RequestMapping
        public String manu(){
            return "Добро пожаловать в калькулятор.";

        }
        @GetMapping(path = "/plus")
        public String add(@RequestParam int num1, @RequestParam int num2) {
            return  calculatorService.addition(num1,num2);
        }
        @GetMapping(path = "/minus")
        public String subtract(@RequestParam int num1,@RequestParam int num2) {
            return  calculatorService.subtraction(num1,num2);

        }
        @GetMapping(path = "/multiply")
        public String multiply(@RequestParam int num1,@RequestParam int num2) {
            return  calculatorService.multiplication(num1,num2);
            }
        @GetMapping(path = "/divide")
        public String divide(@RequestParam int num1,@RequestParam int num2) {
            return  calculatorService.division(num1,num2);

    }


}
