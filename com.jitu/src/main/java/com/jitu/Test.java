package com.jitu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {
    public static void main(String[] args) {
        // ✅ 1. Update these variables for your setup
        String url = "jdbc:mysql://localhost:3306/mydb?useSSL=false&serverTimezone=UTC";
        String user = "root";
        String pass = "jitu@123";

        // 🔁 2. Try-with-resources ensures the connection is closed automatically
        try (Connection conn = DriverManager.getConnection(url, user, pass)) {
            if (conn != null) {
                System.out.println("✅ Connected to MySQL successfully!");
            } else {
                System.err.println("❌ Failed to make connection!");
            }
        } catch (SQLException e) {
            System.err.println("❌ SQL error:");
            System.err.println("SQLState: " + e.getSQLState());
            System.err.println("ErrorCode: " + e.getErrorCode());
            System.err.println("Message: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

