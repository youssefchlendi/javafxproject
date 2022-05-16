package com.javafx;

import java.io.IOException;
import java.util.function.Function;

import javafx.event.ActionEvent;
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
    public void colorier(ActionEvent e) {
        // set bg color to red
        if(e.getSource()==b1)
        {
        	bx.setStyle("-fx-background-color: red");
        }else if(e.getSource()==b2)
        {
        	bx.setStyle("-fx-background-color: green");
        }else if(e.getSource()==b3)
        {
        	bx.setStyle("-fx-background-color: blue");
        }
    }
}
