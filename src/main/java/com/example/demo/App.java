package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // Stage: ventana principal
        // Scene: contenido visual de la ventana

        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Intro.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 1920, 1080);
        stage.setTitle("Monster Cards");
        stage.setScene(scene);
        stage.show();
    }

}
