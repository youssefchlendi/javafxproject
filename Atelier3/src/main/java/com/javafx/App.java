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
        HBox hb2 = new HBox();
        HBox hb3 = new HBox();

        Label l1 = new Label("Enter the username");
        TextField tf1 = new TextField();
        Label l2 = new Label("Enter the password");
        TextField tf2 = new TextField();
        tf1.setPrefColumnCount(10);
        Label l3 = new Label("");
        Button b1 = new Button("Login");
        hb1.getChildren().addAll(l1, tf1);
        hb1.setSpacing(10);
        hb1.setPadding(new Insets(20));
        hb2.getChildren().addAll(l2, tf2);
        hb2.setPadding(new Insets(20));
        hb2.setSpacing(10);
        hb3.getChildren().addAll(b1, l3);
        hb3.setPadding(new Insets(20));
        hb3.setSpacing(10);
        vBox.getChildren().addAll(hb1, hb2, hb3);
        vBox.setPadding(new Insets(20));
        vBox.setSpacing(10);

        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (tf1.getText().equals("admin") && tf2.getText().equals("admin")) {
                    try {
                        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
                        scene = new Scene(root, 600, 400);
                        stage.setScene(scene);
                        stage.show();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {
                    l3.setText("Invalid username or password");
                }
            }
        });

        Scene scene = new Scene(vBox);
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        

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