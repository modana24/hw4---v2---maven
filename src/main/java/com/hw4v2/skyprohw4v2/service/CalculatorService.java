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

    public String calculateSum(Integer num1, Integer num2) {
        if (num1 == null & num2 == null) {
            return "Не передан параметр";
        }
        return String.valueOf(num1 + num2);
    }


    @GetMapping("/minus")
    public String calculateMinus(Integer num1, Integer num2) {
        if (num1 == null & num2 == null) {
            return "Не передан параметр";
        }
        return String.valueOf(num1 - num2);
    }

    @GetMapping("/multiply")
    public String calculateMultiply(Integer num1, Integer num2) {
        if (num1 == null & num2 == null) {
            return "Не передан параметр";
        }
        return String.valueOf(num1 * num2);
    }

    @GetMapping("/divide")
    public String calculatedivide(Integer num1, Integer num2) {
        if (num1 == null & num2 == null) {
            return "Не передан параметр";
        } else if (num2 == 0) {
            return "Делить на ноль нельзя";
        }
        return String.valueOf(num1 / num2);
    }
}
