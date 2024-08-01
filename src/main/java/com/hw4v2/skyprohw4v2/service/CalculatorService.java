package com.hw4v2.skyprohw4v2.service;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
@Component
public class CalculatorService {


    @GetMapping("/hello")
    public String sayHello() {
        return "<b>Рад тебя видеть!</b>";
    }

    @GetMapping("/bye")
    public String sayBye() {
        return "<b>Прощай милый друг...</b>";
    }
}
