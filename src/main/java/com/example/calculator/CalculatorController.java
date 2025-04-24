package com.example.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CalculatorController {

    private final CalculatorService calculatorService;

    // Injection du service via le constructeur
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    // Endpoint pour additionner deux nombres
    @GetMapping("/add")
    public int add(@RequestParam int a, @RequestParam int b) {
        return calculatorService.add(a, b);
    }

    // Endpoint pour soustraire deux nombres
    @GetMapping("/subtract")
    public int subtract(@RequestParam int a, @RequestParam int b) {
        return calculatorService.subtract(a, b);
    }
}