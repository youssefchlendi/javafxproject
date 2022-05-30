package com.javafx;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Function;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class sampleController implements Initializable{

    @FXML
    ComboBox<String> comboBox;

    @FXML
    Label message;

    ObservableList<String> list = FXCollections.observableArrayList("zarzis", "sfax", "bizerte","kef");
    
    

    @FXML
    public void afficher(){
        System.out.println(comboBox.getSelectionModel().getSelectedItem());
        message.setText("Selected item"+comboBox.getSelectionModel().getSelectedItem());
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        comboBox.setItems(list);
    }
}
