package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import sos.bichinhos.sosbichinhos.Main;

public class ControllerLogin {

    @FXML
    private void perfil(ActionEvent e){
        Main.trocaDeTela("telaPerfil");
    }

}
