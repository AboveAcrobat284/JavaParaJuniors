module com.upchiapas.javaparajuniors {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.upchiapas.javaparajuniors to javafx.fxml;
    exports com.upchiapas.javaparajuniors;
    exports com.upchiapas.javaparajuniors.controllers;
    opens com.upchiapas.javaparajuniors.controllers to javafx.fxml;
}