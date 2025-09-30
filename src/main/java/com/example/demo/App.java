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

        // Objeto fxml
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("Atributos.fxml"));

        // Escena con el fmxl cargado
        Scene scene = new Scene(fxmlLoader.load(), 1920, 1080);

        // Título de la escena
        stage.setTitle("Ventana principal");

        // Cambiar contenido de la ventana principal
        stage.setScene(scene);

        // Mostrar ventana principal
        stage.show();
    }
}
