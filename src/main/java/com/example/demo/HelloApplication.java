package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.stage.Stage;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        // Stage: ventana principal
        // Scene: contenido visual de la ventana

        // Objeto fxml
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        // Escena de size-500 con el fmxl cargado
        Scene scene = new Scene(fxmlLoader.load(), 1500, 880);

        stage.setTitle("Ventana principal");

        // Cambiar contenido de la ventana principal
        stage.setScene(scene);

        // Mostrar ventana principal
        stage.show();
    }
}
