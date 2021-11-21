module sos.bichinhos.sosbichinhos {
    requires javafx.controls;
    requires javafx.fxml;


    opens sos.bichinhos.sosbichinhos to javafx.fxml;
    exports sos.bichinhos.sosbichinhos;
    exports controllers;
    opens controllers to javafx.fxml;
}