package com.example.inventoryapp;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import static java.lang.Integer.parseInt;

public class AddProduct {
    @FXML
    private TextField nameTF;
    @FXML
    private TextField eanCodeTF;
    @FXML
    private TextField quantityTF;
    private InventoryViewModel inventoryViewModel;

    public void setInventoryViewModel(InventoryViewModel inventoryViewModel) {
        this.inventoryViewModel = inventoryViewModel;
    }

    public void handleAddProductClick(){
        this.inventoryViewModel.handleAddProduct(nameTF.getText(), parseInt(eanCodeTF.getText()), parseInt(quantityTF.getText()));
    }
}
