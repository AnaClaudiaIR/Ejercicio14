/*package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main2 extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("DNI");
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Label dniLabel = new Label("DNI: ");
        TextField dniField = new TextField();
        gridPane.add(dniLabel, 0, 0);
        gridPane.add(dniField, 1, 0);

        Button aceptarButton = new Button("Confirmar");
        gridPane.add(aceptarButton, 1, 1);

        aceptarButton.setOnAction(e -> {
            String numero = dniLabel.getText();
            if (!numero.matches("\\d{8}[A-Z]")) {
                Alert alert = new Alert(Alert.AlertType.WARNING);
                alert.setTitle("Error");
                alert.setHeaderText(null);
                alert.setContentText("Los datos no han sido introducidos correctamente.");
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
*/