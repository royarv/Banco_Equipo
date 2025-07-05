package com.example.banco2;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class RetirarController {
    @FXML private TextField cantidadField;
    @FXML private Label mensajeLabel;

    @FXML
    private void retirar() {
        try {
            double cantidad = Double.parseDouble(cantidadField.getText());
            if (Cuenta.retirar(cantidad)) {
                mensajeLabel.setText("Se retiraron $" + cantidad);
            } else {
                mensajeLabel.setText("Fondos insuficientes");
            }
        } catch (NumberFormatException e) {
            mensajeLabel.setText("Ingrese un número válido");
        }
    }

    @FXML
    private void volverMenu() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("menu-view.fxml"));
        Scene scene = new Scene(loader.load());
        Stage stage = (Stage) cantidadField.getScene().getWindow();
        stage.setScene(scene);
    }
}
