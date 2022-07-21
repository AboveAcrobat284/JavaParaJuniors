package com.upchiapas.javaparajuniors.controllers;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

public class MenuController {

    @FXML
    private MenuItem btnAbrirMenuCBCinco;

    @FXML
    private MenuItem btnAbrirMenuCBCuatro;

    @FXML
    private MenuItem btnAbrirMenuCBDos;

    @FXML
    private MenuItem btnAbrirMenuCBTres;

    @FXML
    private MenuItem btnMenuASUno;

    @FXML
    private MenuItem btnMenuCBUno;

    @FXML
    private MenuItem btnMenuOCinco;

    @FXML
    private MenuItem btnMenuOCuatro;

    @FXML
    private MenuItem btnMenuODos;

    @FXML
    private MenuItem btnMenuOTres;

    @FXML
    private MenuItem btnMenuOUno;

    @FXML
    private MenuItem btnMenuSCCuatro;

    @FXML
    private MenuItem btnMenuSCDos;

    @FXML
    private MenuItem btnMenuSCTres;

    @FXML
    private MenuItem btnMenuSCUno;

    @FXML
    private MenuItem btnMenuStringDos;

    @FXML
    private MenuItem btnMenuStringUno;

    @FXML
    private Button btnRegresar;

    @FXML
    private MenuButton cbBasico;

    @FXML
    private TextArea txaInfo;

    @FXML
    void btnAbrirMenuASUno(ActionEvent event) {

    }

    @FXML
    void btnAbrirMenuCBCinco(ActionEvent event) {

    }

    @FXML
    void btnAbrirMenuCBCuatro(ActionEvent event) {

    }

    @FXML
    void btnAbrirMenuCBDos(ActionEvent event) {

    }

    @FXML
    void btnAbrirMenuCBTres(ActionEvent event) {

    }

    @FXML
    void btnAbrirMenuCBUno(ActionEvent event) {
        try
        {
            File f = new File("C:/Users/Carlos Gumeta/Desktop/txtJava/ArraysJava.txt");
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(f), "utf-8"));
            try {
                int cadena;
                while ((cadena = in.read()) != -1) {
                    txaInfo.setText(txaInfo.getText() +   (char)cadena );

                }
            } catch (Exception e) {

            } finally {
                in.close();
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    @FXML
    void btnAbrirMenuOCinco(ActionEvent event) {

    }

    @FXML
    void btnAbrirMenuOCuatro(ActionEvent event) {

    }

    @FXML
    void btnAbrirMenuODos(ActionEvent event) {

    }

    @FXML
    void btnAbrirMenuOTres(ActionEvent event) {

    }

    @FXML
    void btnAbrirMenuOUno(ActionEvent event) {

    }

    @FXML
    void btnAbrirMenuSCCuatro(ActionEvent event) {

    }

    @FXML
    void btnAbrirMenuSCDos(ActionEvent event) {

    }

    @FXML
    void btnAbrirMenuSCTres(ActionEvent event) {

    }

    @FXML
    void btnAbrirMenuSCUno(ActionEvent event) {

    }

    @FXML
    void btnAbrirMenuStringDos(ActionEvent event) {

    }

    @FXML
    void btnAbrirMenuStringUno(ActionEvent event) {

    }

    @FXML
    void btnRegresarALoginOnMouseClicked(MouseEvent event) {

    }

    @FXML
    void cbBasicoOnMouseClicked(MouseEvent event) {
        System.out.println(cbBasico.getText());
    }

    @FXML
    void cbBasicoOnMouseExited(MouseEvent event) {
        System.out.println("Exit");
    }


}