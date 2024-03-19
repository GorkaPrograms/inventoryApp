package com.example.inventoryapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class InventoryApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(InventoryApplication.class.getResource("room-one-view.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setTitle("Application d'inventaire");
        //
        InventoryModel inventoryModel = new InventoryModel();
        InventoryViewModel inventoryViewModel = new InventoryViewModel();
        inventoryViewModel.setModel(inventoryModel);
        RoomOne roomOne = fxmlLoader.getController();
        roomOne.setInventoryViewModel(inventoryViewModel);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}