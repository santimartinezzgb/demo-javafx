package com.example.demo;

import com.sun.tools.javac.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.security.cert.Extension;

public class ControladorIntro {

    @FXML
    private Button idMisCartas;

    @FXML
    protected void mostrarCartas() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Cartas.fxml"));
        Stage stage = (Stage) idMisCartas.getScene().getWindow();
        Scene scene = new Scene(root, 1920, 1080);
        stage.setScene(scene);
        stage.show();
    }
}
