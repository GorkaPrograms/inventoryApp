package com.example.inventoryapp;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TabPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;

public class RoomOne {
    @FXML
    private TabPane generalTabPane;
    @FXML
    private TableColumn name;
    @FXML
    private TableColumn ean_code;
    @FXML
    private TableColumn quantity;
    @FXML
    private TableColumn deleteCol;
    @FXML
    private TableView<Product> productTableView;
    private InventoryViewModel inventoryViewModel;

    public void setInventoryViewModel(InventoryViewModel inventoryViewModel) {
        this.inventoryViewModel = inventoryViewModel;
        name.setCellValueFactory(new PropertyValueFactory<>("name"));
        ean_code.setCellValueFactory(new PropertyValueFactory<>("ean_code"));
        quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        productTableView.itemsProperty().bind(inventoryViewModel.productProperty());
    }

    public void addProduct() throws IOException {
        this.inventoryViewModel.handleAddProduct();
    }

    public void addRoom(){
        this.inventoryViewModel.handleAddRoom();
    }

    public void deleteRoom(){
        this.inventoryViewModel.handleDeleteRoom();
    }
}