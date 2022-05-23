package com.javafx;

import java.io.IOException;
import java.util.function.Function;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class sampleController {

    @FXML
    CheckBox cercleCB;

    @FXML
    CheckBox rectangleCB;

    @FXML
    CheckBox triangleCB;

    @FXML
    public void efface() {
        cercleCB.setSelected(false);
        rectangleCB.setSelected(false);
        triangleCB.setSelected(false);
      
    }

    @FXML
    public void affiche() {
        String message = "";
        if (cercleCB.isSelected()) {
            message += "cercle ";
        }
        if (rectangleCB.isSelected()) {
            message += "rectangle ";
        }
        if (triangleCB.isSelected()) {
            message += "triangle ";
        }
        System.out.println(message);
    }
}
