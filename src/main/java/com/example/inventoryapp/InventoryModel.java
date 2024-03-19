package com.example.inventoryapp;

import java.sql.*;

public class InventoryModel {

    private Statement stmt;

    public InventoryModel() throws SQLException {
        this.stmt = connectDB();
        testDB();
    }

    public Statement connectDB(){
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

    public void testDB() throws SQLException {
        String sql = "SELECT * FROM product";
        System.out.println(sql);
        ResultSet res = stmt.executeQuery(sql);
        while (res.next()) {
            System.out.println(res.getString("name"));
        }
    }
}
