package com.example;

public class CalculatorModel {
    private double result = 0.0;

    public void calculateResult(double input, String operator) {
        switch (operator) {
            case "+":
                result += input;
                break;
            case "-":
                result -= input;
                break;
            case "*":
                result *= input;
                break;
            case "/":
                if (input != 0) {
                    result /= input;
                } else {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                break;
            default:
                result = input;
                break;
        }
    }

    public double getResult() {
        return result;
    }

    public void clearResult() {
        result = 0.0;
    }
}

