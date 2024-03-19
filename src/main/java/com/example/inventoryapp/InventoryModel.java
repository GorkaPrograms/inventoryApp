package com.example.inventoryapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class InventoryModel {

    private Statement stmt;

    public InventoryModel() {
        this.stmt = connectDB();
    }

    private Statement connectDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3310/inventory";
            Connection con = DriverManager.getConnection(url, "inventory_user", "password");
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

    public void getProducts(){
        try {
            String sql = "SELECT * FROM products ORDER BY id ASC";
            ResultSet res = stmt.executeQuery(sql);
            while(res.next()) {
                String name = res.getString("name");
                int ean_code = res.getInt("ean_code");
                int quantity = res.getInt("quantity");

                System.out.println(name + " " + quantity + " " + ean_code);
            }

        }catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
