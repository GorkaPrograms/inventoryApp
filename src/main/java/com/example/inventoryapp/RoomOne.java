package com.example.inventoryapp;

import javafx.fxml.FXML;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;

public class RoomOne {
    private InventoryViewModel inventoryViewModel;
    @FXML
    private TabPane generalTabPane;

    @FXML
    private TableColumn name;

    @FXML
    private TableColumn quantity;

    @FXML
    private TableColumn ean_code;

    public void setInventoryViewModel(InventoryViewModel inventoryViewModel){
        this.inventoryViewModel = inventoryViewModel;
        //name.cellFactoryProperty(new PropertyValueFactory<>("name"));
        //name.cellFactoryProperty(new PropertyValueFactory<>("quantity"));
        //name.cellFactoryProperty(new PropertyValueFactory<>("ean_code"));
    }

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