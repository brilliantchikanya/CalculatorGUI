package com.bullet.calculatorgui;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorController implements Initializable {
    public TextField tf_display;
    public Button btn_three;
    public Button btn_divide;
    public Button btn_multiply;
    public Button btn_subtract;
    public Button btn_seven;
    public Button btn_eight;
    public Button btn_nine;
    public Button btn_one;
    public Button btn_six;
    public Button btn_five;
    public Button btn_four;
    public Button btn_add;
    public Button btn_two;
    public Button btn_delete;
    public Button btn_equals;
    public Button btn_zero;
    public Button btn_clear;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        addButtonListeners();

    }




    // Add action listeners

    private void addButtonListeners() {
        btn_add.setOnAction(event -> onAdd());
        btn_clear.setOnAction(event -> onClear());
        btn_subtract.setOnAction(event -> onSubtract());
        btn_multiply.setOnAction(event -> onMultiply());
        btn_divide.setOnAction(event -> onDivide());
        btn_delete.setOnAction(event -> onDelete());
        btn_zero.setOnAction(event -> onZero());
        btn_zero.setOnAction(event -> onZero());
        btn_one.setOnAction(event -> onOne());
        btn_two.setOnAction(event -> onTwo());
        btn_three.setOnAction(event -> onThree());
        btn_four.setOnAction(event -> onFour());
        btn_five.setOnAction(event -> onFive());
        btn_six.setOnAction(event -> onSix());
        btn_seven.setOnAction(event -> onSeven());
        btn_eight.setOnAction(event -> onEight());
        btn_nine.setOnAction(event -> onNine());
    }

    private void onZero() {
        tf_display.setText(tf_display.getText() + "0");
    }

    private void onOne() {
        tf_display.setText(tf_display.getText() + "1");
    }

    private void onTwo() {
        tf_display.setText(tf_display.getText() + "2");
    }

    private void onThree() {
        tf_display.setText(tf_display.getText() + "3");
    }

    private void onFour() {
        tf_display.setText(tf_display.getText() + "4");
    }

    private void onFive() {
        tf_display.setText(tf_display.getText() + "5");
    }

    private void onSix() {
        tf_display.setText(tf_display.getText() + "6");
    }

    private void onSeven() {
        tf_display.setText(tf_display.getText() + "7");
    }

    private void onEight() {
        tf_display.setText(tf_display.getText() + "8");
    }

    private void onNine() {
        tf_display.setText(tf_display.getText() + "9");
    }

    private void onAdd() {
        tf_display.setText(tf_display.getText() + "+");
    }

    private void onSubtract() {
        tf_display.setText(tf_display.getText() + "-");
    }

    private void onDivide() {
        tf_display.setText(tf_display.getText() + "/");
    }

    private void onMultiply() {
        tf_display.setText(tf_display.getText() + "*");
    }

    private void onDelete() {
        //tf_display.setText(tf_display.getText() + "+");
    }

    private void onClear() {
        tf_display.clear();
    }
}