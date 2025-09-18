package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void tipo() {
        welcomeText.setText("Tipo fuego");
    }

    @FXML
    protected void fuerza() {
        welcomeText.setText("Tiene 80 puntos de fuerza");
    }

    @FXML
    protected void vida() {
        welcomeText.setText("Tiene 60 puntos de vida");
    }

    @FXML
    protected void defensa() {
        welcomeText.setText("Tiene 0 puntos de defensa");
    }
}
