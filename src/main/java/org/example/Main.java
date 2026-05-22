package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
//import java.awt.*;
//import java.awt.TextField; --> No se necesitan estos imports
import javafx.scene.control.*;

import java.util.Optional;


public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Número 10 dígitos");
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Label numeroLabel = new Label("Número: ");
        TextField numeroField = new TextField();
        gridPane.add(numeroLabel, 0, 0);
        gridPane.add(numeroField, 1, 0);

        Button aceptarButton = new Button("Confirmar");
        gridPane.add(aceptarButton, 1, 1);

        aceptarButton.setOnAction(e -> {
            String numero = numeroField.getText();
            if (numero.length() != 10) {
                Alert alert = new Alert(Alert.AlertType.WARNING); //Mostrar un mensaje de error si no cumple la condición
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("El campo debe tener 10 caracteres.");
                alert.showAndWait();
            } else {
                System.out.println("Número: " + numero);
            }
        });
        Scene scene = new Scene(gridPane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
