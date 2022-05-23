package com.javafx;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;


public class sampleController {
    
    @FXML
    TextField textField;

    @FXML
    Button butt;

    @FXML
    ListView<String> listView;

    public void ajouter(){
        listView.getItems().add(textField.getText());

    }

    public void supprimer(){
        listView.getItems().remove(listView.getSelectionModel().getSelectedIndex());
    }
    
}
