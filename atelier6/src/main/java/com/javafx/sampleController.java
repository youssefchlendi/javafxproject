package com.javafx;

import java.io.IOException;
import java.util.function.Function;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;

public class sampleController {

    @FXML
    TextField txt;

    @FXML
    Label lbl1;


    @FXML
    public void Calculate() {
        try{
            int a = Integer.parseInt(txt.getText());
            int b = a * a;
            lbl1.setText("Carré = " +String.valueOf(b));
        }catch(Exception e){
            lbl1.setText("Error Pleaase enter a num");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error");
            alert.setContentText("Please enter a num");
            alert.showAndWait();
            
        }
    }
}
