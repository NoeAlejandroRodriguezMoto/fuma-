package com.upchiapas.tripadvisor02.controllers;

import com.upchiapas.tripadvisor02.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Label myLabel;

    @FXML
    private ChoiceBox<String> myChoiceBox;
    private String[] cigarros = {"1","2","3","4","5","mas"};

    public void initialize(URL arg0, ResourceBundle arg1){
        myChoiceBox.getItems().addAll(cigarros);
    }
    @FXML
    private Label myLabel2;
    @FXML
    private RadioButton myButtonConfudido;


    @FXML
    private RadioButton myButtonTriste;

    @FXML
    private RadioButton myButtonConfundido;

    @FXML
    private RadioButton myButtonFeliz;


    @FXML
    void getEstadoDeAnimo(ActionEvent event) {
        if (myButtonTriste.isSelected()){
            myLabel2.setText(myButtonTriste.getText());
        }
        else if(myButtonConfudido.isSelected()){
            myLabel2.setText(myButtonConfudido.getText());
        }
        if (myButtonFeliz.isSelected()){
            myLabel2.setText(myButtonFeliz.getText());
        }

    }
    @FXML
    private Label mylabel3;
    @FXML
    private ToggleGroup EstadoDeAnimo;

    @FXML
    private RadioButton myButtonNo;

    @FXML
    private RadioButton myButtonSi;

    @FXML
    void getEstasAcompañado(ActionEvent event) {
        if (myButtonSi.isSelected()){
            mylabel3.setText(myButtonSi.getText());
        }
        else if(myButtonNo.isSelected()){
            mylabel3.setText(myButtonNo.getText());
        }
    }
    @FXML
    private Button btnFormulario;
    @FXML
    void btnFormularioOnMouseClicked(MouseEvent event) {
        HelloApplication.setFXML("entrada-view","Entrada");
    }
    @FXML
    private Button btnOk;
    @FXML
    private TextArea mytaComentario;

    @FXML
    private TextField mytfComentario;

    @FXML
    void handieButtonAction(ActionEvent event) {
        String coment = mytfComentario.getText();
        mytaComentario.appendText(coment + "\n");

    }
}
