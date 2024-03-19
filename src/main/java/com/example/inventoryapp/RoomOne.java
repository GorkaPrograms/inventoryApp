package com.example.inventoryapp;

import javafx.fxml.FXML;
import javafx.scene.control.TabPane;

public class RoomOne {
    @FXML
    private TabPane generalTabPane;
    private InventoryViewModel inventoryViewModel;

    public void setInventoryViewModel(){
        this.inventoryViewModel = inventoryViewModel;
    }

    public void addProduct(){
        this.inventoryViewModel.handleAddProduct();
    }

    public void addRoom(){
        this.inventoryViewModel.handleAddRoom();
    }

    public void deleteRoom(){
        this.inventoryViewModel.handleDeleteRoom();
    }
}