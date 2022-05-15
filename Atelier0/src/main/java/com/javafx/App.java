package com.javafx;
import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        VBox vBox = new VBox();
        HBox hb1 = new HBox();

        Scene scene = new Scene(vBox);

        hb1.setSpacing(10);
        hb1.setPadding(new Insets(20));


        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        Label label = new Label("Enter your name: ");
        TextField textField = new TextField();
        hb1.getChildren().addAll(label, textField);

        HBox hb2 = new HBox();
        hb2.setSpacing(10);
        hb2.setPadding(new Insets(20));
        Button button = new Button("Say Hello! ");
        Label label2 = new Label();

            // Button action using EventHandler
        // button.setOnAction(new EventHandler<ActionEvent>() {
        //     @Override
        //     public void handle(ActionEvent event) {
        //         label2.setText("Hello "+textField.getText());
        //     }
        // });
            // Buton action using lambda expression
        button.setOnAction(event -> label2.setText("Hello "+textField.getText()));
        hb2.getChildren().addAll(button, label2);
        vBox.getChildren().addAll(hb1, hb2);

        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}