package com.example.inventoryapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class InventoryModel {

    private Statement stmt;
    private ArrayList<Product> products;

    public InventoryModel() {
        this.stmt = connectDB();
        products = getProducts();
    }

    private Statement connectDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/inventory";
            Connection con = DriverManager.getConnection(url, "inventory_user", "1234");
            stmt = con.createStatement();
            return stmt;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void createProduct(String name, int ean_code,int quantity){
        try {
            String sql = "INSERT INTO products (name,ean_code,quantity) VALUES ('" + name + "', " + ean_code + " " + quantity + "')";
            System.out.println(sql);
            //stmt.execute(sql);
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<Product> getProducts(){
        try {
            ArrayList<Product> products = new ArrayList<>();
            String sql = "SELECT * FROM products ORDER BY id ASC";
            ResultSet res = stmt.executeQuery(sql);
            while(res.next()) {
                String name = res.getString("name");
                int ean_code = res.getInt("ean_code");
                int quantity = res.getInt("quantity");
                products.add(new Product(name,ean_code, quantity));
            }
            return products;
        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
