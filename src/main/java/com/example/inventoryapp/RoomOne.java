package com.example.inventoryapp;

import javafx.fxml.FXML;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class RoomOne {
    @FXML
    private TabPane generalTabPane;
    @FXML
    private TableColumn nameCol;
    @FXML
    private TableColumn eanCol;
    @FXML
    private TableColumn quantityCol;
    @FXML
    private TableColumn deleteCol;
    @FXML
    private TableView<Product> productTableView;
    private InventoryViewModel inventoryViewModel;

    public void setInventoryViewModel(InventoryViewModel inventoryViewModel) {
        this.inventoryViewModel = inventoryViewModel;
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        eanCol.setCellValueFactory(new PropertyValueFactory<>("ean_code"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
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