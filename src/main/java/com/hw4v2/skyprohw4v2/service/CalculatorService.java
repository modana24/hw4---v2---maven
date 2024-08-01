package com.hw4v2.skyprohw4v2.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class CalculatorService {


    public String sayHello() {
        return "<b>Добро пожаловать в калькулятор!</b>";
    }

    public String sayBye() {
        return "<b>Прощай милый друг...</b>";
    }

    public String calculateSum(int num1, int num2) {
        return String.valueOf(num1 + num2);
    }


    @GetMapping("/minus")
    public String calculateMinus(int num1, int num2) {
        return String.valueOf(num1 - num2);
    }

    @GetMapping("/multiply")
    public String calculateMultiply(int num1, int num2) {
        return String.valueOf(num1 * num2);
    }

    @GetMapping("/divide")
    public String calculatedivide(int num1, int num2) {
        return String.valueOf(num1 / num2);
    }
}
