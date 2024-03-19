package com.example.inventoryapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class InventoryApplication extends Application {

    private static InventoryApplication application;
    private Stage roomStage = new Stage();



    @Override
    public void start(Stage stage) throws IOException, SQLException {
        application = this;
        // Initialisation du singleton application
        // Création des composants MVVM communs à toutes les View
        InventoryModel inventoryModel = new InventoryModel();
        InventoryViewModel inventoryViewModel = new InventoryViewModel();
        inventoryViewModel.setModel(inventoryModel);
        loadRoomView(inventoryViewModel);

    }

    public void loadRoomView(InventoryViewModel inventoryViewModel) throws IOException {
        // Chargement du fichier fxml et préparation de la Stage de la View à charger
        FXMLLoader fxmlLoader = new FXMLLoader(InventoryApplication.class.getResource("room-one-view.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        // Création des composants MVVM propres à la View + agrégation du ViewModel à la View
        RoomOne roomOne = fxmlLoader.getController();
        roomOne.setInventoryViewModel(inventoryViewModel);
        // Affichage de la Stage de la View à charger
        roomStage.setTitle("Inventaire");
        roomStage.setScene(scene);
        roomStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}