module com.example.inventoryapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.inventoryapp to javafx.fxml;
    exports com.example.inventoryapp;
}