package com.example.calculator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    // Méthode pour additionner deux nombres
    public int add(int a, int b) {
        return a + b;
    }

    // Méthode pour soustraire deux nombres
    public int subtract(int a, int b) {
        return a - b;
    }

}
