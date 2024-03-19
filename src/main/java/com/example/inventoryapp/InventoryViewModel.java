package com.example.inventoryapp;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.util.Duration;

public class InventoryViewModel {
    private InventoryModel inventoryModel;

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
}
