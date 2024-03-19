package com.example.inventoryapp;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.util.Duration;

import java.util.ArrayList;

public class InventoryViewModel {
    private InventoryModel inventoryModel;
    private ListProperty<Product> product = new SimpleListProperty(FXCollections.observableList(new ArrayList<>()));


    public void setModel(InventoryModel inventoryModel) {
        this.inventoryModel = inventoryModel;
        Timeline timeline = new Timeline(
                new KeyFrame(
                        Duration.millis(500),
                        e->{
                            inventoryModel.getProducts();
                        }
                )
        );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    public void handleAddProduct(){

    }

    public void handleAddRoom(){

    }

    public void handleDeleteRoom(){

    }

    public ObservableList<Product> getProduct() {
        return product.get();
    }

    public ListProperty<Product> productProperty() {
        return product;
    }

    public void setProduct(ObservableList<Product> product) {
        this.product.set(product);
    }
}
