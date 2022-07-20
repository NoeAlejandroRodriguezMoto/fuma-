package com.upchiapas.tripadvisor02.controllers;

import com.upchiapas.tripadvisor02.HelloApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

    public class InicioController {

        @FXML
        private Button btnComenzar;

        @FXML
        private Label labelLaMotivacion;

        @FXML
        void btnComenzarOnMouseClicked(MouseEvent event) {
            HelloApplication.setFXML("entrada-view","Entrada");
        }

    }


