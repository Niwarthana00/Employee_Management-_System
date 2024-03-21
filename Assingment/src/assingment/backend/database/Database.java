/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package assingment.backend.database;

import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.*;

public class Database {

    private static final String JDBC_URL="jdbc:mysql://127.0.0.1:3306/cis";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    
//    public static void main(String args[]) {
//        Connection connection = Database.connect();
//        if (connection != null) {
//            System.out.println("Connection successful!");
//            // Perform additional logic here if needed
//            Database.disconnect(connection); // Close the connection when done
//        } else {
//            System.out.println("Connection failed!");
//        }
//    }
    
     public static Connection connect() {
        Connection connection = null;
        try {
            // Registering the MySQL JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            // Establishing a connection
            connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
            System.out.println("Connected to the database");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection error: " + e.getMessage());
        }
        return connection;
    }
    
    // Method to close the database connection
    public static void disconnect(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Disconnected from the database");
            } catch (SQLException e) {
                System.out.println("Disconnection error: " + e.getMessage());
            }
        }
    }
}
