package com.example.inventoryapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class InventoryApplication extends Application {
    private static InventoryApplication application;
    private Stage mainStage = new Stage();
    private Stage modalStage = new Stage();


    @Override
    public void start(Stage stage) throws IOException {
        // Initialisation du singleton application
        application = this;

        InventoryModel inventoryModel = new InventoryModel();
        InventoryViewModel inventoryViewModel = new InventoryViewModel();
        inventoryViewModel.setModel(inventoryModel);

        loadMainScene(inventoryViewModel);
    }

    public void loadMainScene(InventoryViewModel inventoryViewModel) throws IOException{
        FXMLLoader fxmlLoader =  new FXMLLoader(InventoryApplication.class.getResource("room-one-view.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        RoomOne roomOne = fxmlLoader.getController();
        roomOne.setInventoryViewModel(inventoryViewModel);
        mainStage.setTitle("Application réserve");
        mainStage.setScene(scene);
        mainStage.show();
    }

    public void loadModalScene(InventoryViewModel inventoryViewModel) throws IOException{
        FXMLLoader fxmlLoader =  new FXMLLoader(InventoryApplication.class.getResource("add-product-view.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        AddProduct addProduct = fxmlLoader.getController();
        addProduct.setInventoryViewModel(inventoryViewModel);
        modalStage.setTitle("Ajouter un produit");
        modalStage.setScene(scene);
        modalStage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static InventoryApplication getInstance() {
        return application;
    }
}