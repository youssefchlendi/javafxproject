package com.javafx;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class sampleController {
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label err;

    @FXML
    private void login() {
        if (username.getText().equals("admin") && password.getText().equals("admin")) {
            try {
                App.setRoot("sample2");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            err.setText("Invalid username or password");
        }
    }

    @FXML
    private void cancel() {
        try {
            App.setRoot("sample");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}

