package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ControladorCartas {
    @FXML
    private Button carta1;
    @FXML
    private Button carta2;
    @FXML
    private Button carta3;
    @FXML
    private Button carta4;
    @FXML
    private Button carta5;
    @FXML
    private Button carta6;
    @FXML
    private Button carta7;
    @FXML
    private Button carta8;
    @FXML
    private Button carta9;
    @FXML
    private Button carta10;
    @FXML
    private Button carta11;
    @FXML
    private Button carta12;
    @FXML
    private Button botonVolver;

    @FXML
    protected void mostrarAtributos1() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Atributos1.fxml"));
        Stage stage = (Stage) carta1.getScene().getWindow();
        Scene scene = new Scene(root, 1920, 1080);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void mostrarAtributos2() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Atributos2.fxml"));
        Stage stage = (Stage) carta2.getScene().getWindow();
        Scene scene = new Scene(root, 1920, 1080);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void mostrarAtributos3() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Atributos3.fxml"));
        Stage stage = (Stage) carta3.getScene().getWindow();
        Scene scene = new Scene(root, 1920, 1080);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void mostrarAtributos4() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Atributos4.fxml"));
        Stage stage = (Stage) carta4.getScene().getWindow();
        Scene scene = new Scene(root, 1920, 1080);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void mostrarAtributos5() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Atributos5.fxml"));
        Stage stage = (Stage) carta5.getScene().getWindow();
        Scene scene = new Scene(root, 1920, 1080);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void mostrarAtributos6() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Atributos6.fxml"));
        Stage stage = (Stage) carta6.getScene().getWindow();
        Scene scene = new Scene(root, 1920, 1080);
        stage.setScene(scene);
        stage.show();
    }    @FXML
    protected void mostrarAtributos7() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Atributos7.fxml"));
        Stage stage = (Stage) carta7.getScene().getWindow();
        Scene scene = new Scene(root, 1920, 1080);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void mostrarAtributos8() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Atributos8.fxml"));
        Stage stage = (Stage) carta8.getScene().getWindow();
        Scene scene = new Scene(root, 1920, 1080);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void mostrarAtributos9() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Atributos9.fxml"));
        Stage stage = (Stage) carta9.getScene().getWindow();
        Scene scene = new Scene(root, 1920, 1080);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void mostrarAtributos10() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Atributos10.fxml"));
        Stage stage = (Stage) carta10.getScene().getWindow();
        Scene scene = new Scene(root, 1920, 1080);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void mostrarAtributos11() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Atributos11.fxml"));
        Stage stage = (Stage) carta11.getScene().getWindow();
        Scene scene = new Scene(root, 1920, 1080);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    protected void mostrarAtributos12() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Atributos12.fxml"));
        Stage stage = (Stage) carta12.getScene().getWindow();
        Scene scene = new Scene(root, 1920, 1080);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    protected void volverInicio() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Intro.fxml"));
        Stage stage = (Stage) botonVolver.getScene().getWindow();
        Scene scene = new Scene(root, 1920, 1080);
        stage.setScene(scene);
        stage.show();
    }
}
