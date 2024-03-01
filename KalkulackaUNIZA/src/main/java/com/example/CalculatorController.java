package com.example;

public class CalculatorController {
    private String currentInput = "";
    private String operator = "";

    private CalculatorModel model;

    public CalculatorController(CalculatorModel model) {
        this.model = model;
    }

    public void updateCurrentInput(String input) {
        if (input.matches("[0-9.]")) {
            currentInput += input;
        } else if (input.matches("[+\\-*/]")) {
            operator = input;
            double inputNumber = Double.parseDouble(currentInput);
            model.calculateResult(inputNumber, operator);
            currentInput = "";
        }
    }

    public String getCurrentInput() {
        return currentInput;
    }

    public String getOperator() {
        return operator;
    }

    public void clearAll() {
        currentInput = "";
        operator = "";
        model.clearResult();
    }

    public double evaluateExpression(String expression) {
        double inputNumber = Double.parseDouble(currentInput);
        model.calculateResult(inputNumber, operator);
        currentInput = "";
        operator = "";
        return model.getResult();
       
    }
}
