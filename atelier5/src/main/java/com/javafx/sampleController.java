package com.javafx;

import java.io.IOException;
import java.util.function.Function;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

public class sampleController {

    @FXML
    private Button b1;
    @FXML
    private Button b2;
    @FXML
    private Button b3;
    @FXML
    VBox bx;
    


    @FXML
    public void red() {
        // set bg color to red
        bx.setStyle("-fx-background-color: red");
    }

    @FXML
    public void blue() {
        bx.setStyle("-fx-background-color: blue");
    }

    @FXML
    public void green() {
        bx.setStyle("-fx-background-color: green");
    }
}
