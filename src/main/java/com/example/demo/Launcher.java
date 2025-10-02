package com.example.demo;

import javafx.application.Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static javax.management.remote.JMXConnectorFactory.connect;

public class Launcher {
    public static void main(String[] args) throws SQLException {
        Application.launch(App.class, args);
        connect();
    }

    private static void connect(){
        String url = "jdbc:sqlite:sample.db";

        try (Connection conn = DriverManager.getConnection(url)){
            if ( conn != null){
                System.out.println("Connected to the database.");
            }
        } catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
