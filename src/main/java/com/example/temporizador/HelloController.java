package com.example.temporizador;

import es.ieslosmontecillos.componentes_caroantonio.CampoTextoNumerico;
import es.ieslosmontecillos.componentes_caroantonio.Temporizador;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;


public class HelloController implements Initializable {

    @FXML
    private Temporizador temporizador;
    @FXML
    private CampoTextoNumerico textfield1;
    @FXML
    private Button button1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }

    @FXML
    public void button1OnAction(ActionEvent actionEvent) {

        temporizador.setTiempo(Integer.parseInt(textfield1.getText()));
        temporizador.comienzaTemporizador();

    }
}