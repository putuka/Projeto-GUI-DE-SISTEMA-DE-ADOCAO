package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import sos.bichinhos.sosbichinhos.Main;

public class ControllerDoarAnonimoConcluido {

    @FXML
    protected void voltar (ActionEvent a){

        Main.trocaDeTela("telaDoarAnonimo");
    }



}
