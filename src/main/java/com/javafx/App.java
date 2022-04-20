package com.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
        stage.setTitle("Hello world!");
        stage.setHeight(300);
        stage.setWidth(500);
        VBox vBox = new VBox();
        vBox.setStyle("-fx-background-color: #336699;");
        Text msg = new Text("Hello World!");
        msg.setStyle("-fx-font-size: 24px;");
        Text msg1 = new Text("Hello javafx!");
        msg1.setStyle("-fx-font-weight: bold ;");
        Button button = new Button("Click me!");
        button.setStyle("-fx-background-color: #bada55;");
        vBox.getChildren().addAll(msg, msg1, button);

        Scene scene = new Scene(vBox);
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