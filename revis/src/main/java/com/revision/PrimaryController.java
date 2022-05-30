package com.revision;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;

public class PrimaryController implements Initializable {

    @FXML
    TextField name;

    @FXML
    DatePicker dob;

    @FXML
    ToggleGroup gender;

    @FXML
    ToggleGroup yesNo;

    @FXML
    CheckBox Java;

    @FXML
    CheckBox Dotnet;

    @FXML
    Label nameError;

    @FXML
    Label dobError;

    @FXML
    Label genderError;

    @FXML
    Label yesNoError;

    @FXML
    Label techError;

    @FXML
    Label locationError;

    @FXML
    ComboBox<String> comboBox;
    ObservableList<String> list = FXCollections.observableArrayList("zarzis", "sfax", "bizerte", "kef");

    @FXML
    private void send() {
        try {
            System.out.println("name : " +this.getUserName(name));
        } catch (shortOrLongNameException e1) {
            nameError.setText(e1.getMessage());
        }
        if (dob.getValue() != null) {
            dobError.setText("");
            System.out.println("dob : " + dob.getValue());
        } else {
            dobError.setText("dob is required");
        }
        try {

            System.out.println("gender : " + ((RadioButton) gender.getSelectedToggle()).getText());
            genderError.setText("");
        } catch (Exception e) {
            genderError.setText("gender is required");
        }
        try {
            yesNoError.setText("");
            System.out.println("yesNo : " + ((ToggleButton) yesNo.getSelectedToggle()).getText());
        } catch (Exception e) {
            yesNoError.setText("Reservation is required");
        }

        if (Java.isSelected() || Dotnet.isSelected()) {
            System.out.println("tech : " + Java.isSelected() + " " + Dotnet.isSelected());
        } else {
            techError.setText("tech is required");
        }

        if (comboBox.getValue() != null) {
            locationError.setText("");
            System.out.println("comboBox : " + comboBox.getValue());
        } else {
            locationError.setText("location is required");
        }
    }

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        comboBox.setItems(list);
    }


    public String getUserName(TextField name) throws shortOrLongNameException{

        if (name.getText().length()==0){
            throw new shortOrLongNameException("name is required");
        }else if(name.getText().length()<5){
            throw new shortOrLongNameException("name must be greater than 5");
        }else if(name.getText().length()>10){
            throw new shortOrLongNameException("name must be less than 10");
        }
        return name.getText();
    }
}

