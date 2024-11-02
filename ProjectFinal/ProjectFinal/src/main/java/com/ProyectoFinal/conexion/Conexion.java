package com.ProyectoFinal.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/client_db?useSSL=false&serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD = "9787";
    private static Connection conn = null;

    public static Connection getConnection() throws SQLException {
        if (conn == null || conn.isClosed()) {
            try {
                // Load the MySQL JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");
                
                // Establish and return the database connection
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Database connected successfully.");
            } catch (ClassNotFoundException e) {
                // Throw an SQLException if the driver is not found
                throw new SQLException("MySQL JDBC Driver not found. Please ensure the driver JAR file is in the classpath.", e);
            } catch (SQLException e) {
                // Handle SQL exception for connection issues
                throw new SQLException("Error connecting to the database. Check URL, username, and password.", e);
            }
        }
        return conn;
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Database connection closed.");
            } catch (SQLException e) {
                System.out.println("Failed to close the database connection.");
                e.printStackTrace();
            }
        }
    }
}
