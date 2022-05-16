package com.javafx;

import java.io.IOException;
import java.util.function.Function;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class sampleController {
    @FXML
    private Label ml;
    @FXML
    private ToggleGroup filGroup;

    @FXML
    public void app() {
        ml.setText("You selected " + ((RadioButton) filGroup.getSelectedToggle()).getText());
        ml.setStyle("-fx-text-fill: "+((RadioButton) filGroup.getSelectedToggle()).getText()+";");
    }
}
