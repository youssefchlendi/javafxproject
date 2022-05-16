package com.javafx;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class sampleController {
@FXML
TextField tfName;

    @FXML
    Label lMessage;
    @FXML
    private void sayHello() throws IOException {
        lMessage.setText("Hello "+tfName.getText());
        // gMessage.setText("");
    }
    
    @FXML
    private void switchToGoodBye() throws IOException {
        App.setRoot("goodbye");
    }

    @FXML
    private void switchToHello() throws IOException {
        App.setRoot("sample");
    }

    @FXML
    Label gMessage;

    @FXML
    private void sayGoodbye() {
        gMessage.setText("Goodbye "+tfName.getText());
        lMessage.setText("");
    }
    
}
