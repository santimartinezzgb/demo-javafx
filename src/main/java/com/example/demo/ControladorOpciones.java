package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ControladorOpciones {

    @FXML
    private Button volver;

    @FXML
    private void volverInicio() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Intro.fxml"));
        Stage stage = (Stage) volver.getScene().getWindow();
        Scene scene = new Scene(root, 1920, 1080);
        stage.setScene(scene);
        stage.show();
    }
}
