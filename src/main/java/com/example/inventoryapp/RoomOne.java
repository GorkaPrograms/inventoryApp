package com.example.inventoryapp;

import javafx.fxml.FXML;
import javafx.scene.control.TabPane;

public class RoomOne {
    @FXML
    private TabPane generalTabPane;

    public void addProduct(){
        System.out.println("addProduct");
    }

    public void addRoom(){
        System.out.println("addRoom");
    }

    public void deleteRoom(){
        System.out.println("deleteRoom");
    }
}