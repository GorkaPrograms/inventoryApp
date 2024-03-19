package com.example.inventoryapp;

public class Product {
    private int quantity;

    private int id;

    private String name;

    private int ean_code;

    public Product(int quantity, int id, String name, int ean_code) {
        this.quantity = quantity;
        this.id = id;
        this.name = name;
        this.ean_code = ean_code;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
