package com.upchiapas.javaparajuniors.controllers;

import com.upchiapas.javaparajuniors.HelloApplication;
import com.upchiapas.javaparajuniors.models.User;
import com.upchiapas.javaparajuniors.models.ValidateUser;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

public class LoginController {

    @FXML
    private Button btnCrearCuenta;

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Button btnSalir;

    @FXML
    private PasswordField txtPassword;

    @FXML
    private TextField txtUsername;

    public static ArrayList<User> users = new ArrayList<>();

    @FXML
    void btnCrearCuentaOnMouseClicked(MouseEvent event) {
        users.add(new User(txtUsername.getText(),txtPassword.getText()));
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Info");
        alert.setContentText("La cuenta ha sido creada exitosamente!");
        alert.showAndWait();
    }

    @FXML
    void btnIniciarSesionOnMouseClicked(MouseEvent event) {
        ValidateUser user = new ValidateUser();if(user.autenticarUser(txtUsername.getText(), txtPassword.getText()))

        {
            HelloApplication.setFXML("menu-view","Menu - Java para Juniors");
        }
        else
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Login - Error");
            alert.setContentText("El usuario no existe");
            alert.showAndWait();
        }
    }

    @FXML
    void btnSalirOnMouseClicked(MouseEvent event) {
        System.exit(1);
    }
}