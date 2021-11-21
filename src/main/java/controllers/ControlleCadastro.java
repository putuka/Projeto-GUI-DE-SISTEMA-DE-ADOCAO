package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import sos.bichinhos.sosbichinhos.Main;

public class ControlleCadastro {

    @FXML
    protected void perfil(ActionEvent e ){
        Main.trocaDeTela("telaPerfil");
    }

}
