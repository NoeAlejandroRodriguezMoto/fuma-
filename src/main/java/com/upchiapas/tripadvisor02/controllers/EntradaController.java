package com.upchiapas.tripadvisor02.controllers;

import com.upchiapas.tripadvisor02.HelloApplication;
import com.upchiapas.tripadvisor02.models.Persona;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

import java.time.LocalDate;

public class EntradaController {

    @FXML
    private Button btnAtras;

    @FXML
    private Button btnSiguiente;

    @FXML
    private Label fechaDeNacimiento;

    @FXML
    private Label labelCuantosCigarrosConsume;

    @FXML
    private Label labelMeses;

    @FXML
    private Label labelNacionalidad;

    @FXML
    private Label labelTiempoComoFumador;

    @FXML
    private ChoiceBox<?> myNacionalidad;

    @FXML
    private DatePicker mydatenacimiento;

    @FXML
    private TextField mytxtCantidadCigarros;

    @FXML
    private TextField mytxtMesesDeFumador;

    @FXML
    private TextField mytxtname;

    @FXML
    private Label nombreCompleto;

    @FXML
    private RadioButton radioFemenino;

    @FXML
    private RadioButton radioMasculino;

    @FXML
    private ToggleGroup sexo;

    @FXML
    private Label sexolabel;


    @FXML
    void btnAtrasOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("inicio-view","Inicio");
    }

    private char getSexo() {
        char sexo= ' ';
        if(radioMasculino.isSelected()){
            sexo = 'M';
        }
        else {
            sexo = 'F';
        }
        return sexo;
    }
    @FXML
    void btnSiguienteOnMouseClicked(MouseEvent event) {
        char sexo= getSexo();
        LocalDate fechaNacimiento = LocalDate.of(mydatenacimiento.getValue().getYear(), mydatenacimiento.getValue().getMonth(), mydatenacimiento.getValue().getDayOfMonth());
        HelloApplication.setFXML("inicio-view","Inicio");

    }

    @FXML
    void initialize(){
        mydatenacimiento.setValue(LocalDate.now());
    }

}
