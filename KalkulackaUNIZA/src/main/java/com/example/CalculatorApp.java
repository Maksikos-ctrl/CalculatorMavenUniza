package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class CalculatorApp extends Application {

    private TextField inputField;
    private Label resultLabel;
    private CalculatorController controller;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("JavaFX Calculator");

        CalculatorModel model = new CalculatorModel();
        controller = new CalculatorController(model);

        GridPane gridPane = createGridPane();

        Scene scene = new Scene(gridPane, 300, 400);

        // Apply inline styles directly
        scene.getRoot().setStyle("-fx-background-color: #2b2b2b;");

        inputField.setStyle("-fx-font-size: 18;");
        inputField.setStyle("-fx-background-color: white;"); // Set background color
        inputField.setStyle("-fx-border-radius: 10;"); // Set border radius

        resultLabel.setStyle("-fx-font-size: 18; -fx-background-color: #1c1c1c;");
        resultLabel.setStyle("-fx-border-radius: 5;");

        primaryStage.setScene(scene);

        primaryStage.show();
    }

    private GridPane createGridPane() {
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(10, 10, 10, 10));

        inputField = new TextField();
        inputField.setEditable(false);
        GridPane.setColumnSpan(inputField, 4);
        gridPane.add(inputField, 0, 0);

        resultLabel = new Label("0");
        resultLabel.setMaxWidth(Double.MAX_VALUE);
        GridPane.setColumnSpan(resultLabel, 4);
        gridPane.add(resultLabel, 0, 1);

        String[] buttonLabels = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", ".", "=", "+"
        };

        int row = 2;
        int col = 0;

        for (String label : buttonLabels) {
            Button button = createButton(label);
            gridPane.add(button, col, row);

            col++;
            if (col > 3) {
                col = 0;
                row++;
            }
        }

        return gridPane;
    }

    private Button createButton(String label) {
        Button button = new Button(label);
        button.setMaxWidth(Double.MAX_VALUE);
        button.setMaxHeight(Double.MAX_VALUE);
        button.setStyle("-fx-font-size: 18;");
        button.setOnAction(e -> handleButtonClick(label));
        return button;
    }

    private void handleButtonClick(String label) {
        if (label.equals("=")) {
            calculateResult();
        } else {
            inputField.appendText(label);
        }
    }

    private void calculateResult() {
        try {
            String expression = inputField.getText();
            double result = controller.evaluateExpression(expression);
            resultLabel.setText(String.valueOf(result));
            inputField.clear();
        } catch (ArithmeticException e) {
            resultLabel.setText("Error: " + e.getMessage());
        } catch (Exception e) {
            resultLabel.setText("Error");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
