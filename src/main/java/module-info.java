module com.upchiapas.tripadvisor02 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.upchiapas.tripadvisor02 to javafx.fxml;
    exports com.upchiapas.tripadvisor02;
    exports com.upchiapas.tripadvisor02.controllers;
    opens com.upchiapas.tripadvisor02.controllers to javafx.fxml;
}