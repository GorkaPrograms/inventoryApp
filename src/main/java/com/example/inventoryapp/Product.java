package com.example.inventoryapp;

public class Product {
    String name;
    int ean_code;
    int quantity;

    public Product(){

    }

    public Product(String name, int ean_code, int quantity){
        this.name = name;
        this.ean_code = ean_code;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEan_code() {
        return ean_code;
    }

    public void setEan_code(int ean_code) {
        this.ean_code = ean_code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
