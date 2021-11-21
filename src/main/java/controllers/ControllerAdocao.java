package controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import sos.bichinhos.sosbichinhos.Main;

public class ControllerAdocao {

    @FXML
    protected void doar (ActionEvent e ){
        Main.trocaDeTela("telaDoar");
    }
    @FXML
    protected void apadrinhamento(ActionEvent e){
        Main.trocaDeTela("telaApadrinhamento");
    }
    @FXML
    protected void contribuinte(ActionEvent e){
        Main.trocaDeTela("telaContribuinte");
    }
    @FXML
    protected void perfil(ActionEvent e){
        Main.trocaDeTela("telaPerfil");
    }
    @FXML
    protected void ajuda(ActionEvent e){
        Main.trocaDeTela("telaAjuda");
    }


}



