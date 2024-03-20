package com.example.inventoryapp;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.util.Duration;

import java.io.IOException;
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
                            setProduct(FXCollections.observableList(inventoryModel.getProducts()));
                        }
                )
        );
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }
    public void handleAddProduct(String name, int code, int quantity){
        this.inventoryModel.createProduct(name, code, quantity);
    }

    public void handleAddProductWindow() throws IOException {
        InventoryApplication.getInstance().loadModalScene(this);
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
