package com.hw4v2.skyprohw4v2.controller;

import com.hw4v2.skyprohw4v2.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")

public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/hello")
    public String sayHello() {
    return calculatorService.sayHello();
    }

    @GetMapping("/bye")
    public String sayBye() {
    return calculatorService.sayBye();
    }

    @GetMapping("/plus")
    public String calculateSum(Integer num1, Integer num2) {
        return calculatorService.calculateSum(num1,num2);
    }

    @GetMapping("/minus")
    public String calculateMinus(Integer num1, Integer num2) {
        return calculatorService.calculateMinus(num1,num2);
    }

    @GetMapping("/multiply")
    public String calculateMultiply(Integer num1, Integer num2) {
        return calculatorService.calculateMultiply(num1,num2);
    }

    @GetMapping("/divide")
    public String calculatedivide(Integer num1, Integer num2) {
        return calculatorService.calculatedivide(num1,num2);
    }
}