/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assingment.backend.services;

import assingment.backend.database.Database;
import assingment.backend.interfaces.Designation_Interface;
import assingment.backend.model.Department;
import assingment.backend.model.Designation;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Designation_service implements Designation_Interface {
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;

    @Override
    public boolean createDES(Designation dstob) {
    try {
            connection = (Connection) Database.connect();
            String query = "INSERT INTO designation  (id, name) VALUES (?, ?)";
            statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setInt(1, dstob.getId());
            statement.setString(2, dstob.getName());
            
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                return true;
            } else {
                
                return false;
            }
            
            }catch(SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    
    
    
    @Override
    public List<Designation> readDES(int id) {
      List<Designation> desig = new ArrayList<>();
        String query = "SELECT * FROM designation WHERE id = ?";
        try (Connection connection = (Connection) Database.connect()) {
            statement = (PreparedStatement) connection.prepareStatement(query);
            // Set the parameter for the prepared statement
            statement.setInt(1, id);
            
            // Execute the query
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    // Retrieve department information from the result set
                    int desid = resultSet.getInt("id");
                    String desname = resultSet.getString("name");
                    // Create a new Department object
                    Designation desi = new Designation(desid,desname);
                    // Add the department to the list
                    desig.add(desi);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }     
        return desig; 
    }

    
    
    @Override
    public boolean updateDES(int id, String name) {
    String query = "UPDATE designation SET name = ? WHERE id = ?";
        try (Connection connection = (Connection) Database.connect()) {
            statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setString(1, name);
            statement.setInt(2, id);      
            int rowsUpdated = statement.executeUpdate();  
            return rowsUpdated > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false; 
        }    }

    @Override
    public boolean deleteDES(int id) {
    String query = "DELETE FROM designation WHERE id = ?";
        try (Connection connection = (Connection) Database.connect()) {
             statement = (PreparedStatement) connection.prepareStatement(query);
             statement.setInt(1, id);
             int rowsAffected = statement.executeUpdate();
             return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    
    @Override
    public List<Designation> retrieveAllDES() {
            List<Designation> desigr = new ArrayList<>();
            String query = "SELECT * FROM designation";

            try (Connection connection = (Connection) Database.connect()) {
                statement = (PreparedStatement) connection.prepareStatement(query);
                resultSet = statement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    Designation desig = new Designation(id, name);
                    desigr.add(desig);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return desigr;
    }
    
    
    @Override
    public List<Designation> dataToCombo() {
        List<Designation> designation = new ArrayList<>();
        String query = "SELECT * FROM designation";
        
        try (Connection connection = (Connection) Database.connect()) {
            statement = (PreparedStatement) connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                
                Designation desig = new Designation(id, name);
                designation.add(desig);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return designation;
    }

}
    

