package com.hw4v2.skyprohw4v2.controller;

import com.hw4v2.skyprohw4v2.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
}