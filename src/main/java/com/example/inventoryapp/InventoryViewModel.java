package com.example.inventoryapp;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.util.Duration;

import java.util.ArrayList;

public class InventoryViewModel {
    private InventoryModel inventoryModel;

    ArrayList<Product> product = new ArrayList<>();

    private ListProperty<Product> productItem;

    public void setModel(InventoryModel inventoryModel) {
        // Agrégation du Model
        this.inventoryModel = inventoryModel;
        // Initialisation des propriétés
        updateProduct();
        // Mise à jour périodique des propriétés depuis le Model
        // Ainsi que lancerment périodique du recalcule des données du classement
        Timeline timeline = new Timeline(new KeyFrame(
                Duration.millis(1000),
                e -> {
                    updateProduct();
                }
        ));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    /*public InventoryViewModel(ArrayList<Product> product) {
        product.add(new Product(1,1,"test1",123456789));
        product.add(new Product(1,2,"test1",123456789));
        product.add(new Product(1,3,"test1",123456789));
        product.add(new Product(1,4,"test1",123456789));
        productItem = new SimpleListProperty(FXCollections.observableList(product));
        System.out.println(product.toString());
    }*/

    private void updateProduct() {
        //ranking.set(FXCollections.observableList(inventoryModel.getProduct()));
    }




}
