module com.bullet.calculatorgui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bullet.calculatorgui to javafx.fxml;
    exports com.bullet.calculatorgui;
}