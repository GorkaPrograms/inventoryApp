package com.example.inventoryapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InventoryModel {

    private Statement stmt;

    public InventoryModel() {
        this.stmt = connectDB();
        testDB();
    }

    private Statement connectDB(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3310/inventory";
            Connection con = DriverManager.getConnection(url, "root", "P@ssw0rd");
            stmt = con.createStatement();
            return stmt;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void testDB(){
        String sql = "SELECT * FROM products";
        System.out.println(sql);
    }
}
