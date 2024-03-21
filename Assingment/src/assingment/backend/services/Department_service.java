/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assingment.backend.services;

import assingment.backend.database.Database;
import assingment.backend.interfaces.Department_interface;
import assingment.backend.model.Department;
import java.sql.SQLException;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Department_service implements Department_interface {
    
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;

    @Override
    public boolean createDPT(Department dptob) {
        try {
            connection = (Connection) Database.connect();
            String query = "INSERT INTO department (Dcode, name, Description) VALUES (?, ?, ?)";
            statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setString(1, dptob.getDcode());
            statement.setString(2, dptob.getName());
            statement.setString(3, dptob.getDescription());
            
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
    public List<Department> readDPT(int id) {
        List<Department> departments = new ArrayList<>();
        String query = "SELECT * FROM department WHERE id = ?";
        try (Connection connection = (Connection) Database.connect()) {
            statement = (PreparedStatement) connection.prepareStatement(query);
            // Set the parameter for the prepared statement
            statement.setInt(1, id);
            
            // Execute the query
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    // Retrieve department information from the result set
                    int departmentId = resultSet.getInt("id");
                    String departmentName = resultSet.getString("name");
                    // Create a new Department object
                    Department department = new Department(departmentId, departmentName);
                    // Add the department to the list
                    departments.add(department);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return departments;    
    }

    @Override
    public boolean updateDPT(int id, Department dptob) {
        String query = "UPDATE department SET name = ? , Description = ? WHERE id = ?";
        try (Connection connection = (Connection) Database.connect()) {
            statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setString(1, dptob.getName());
            statement.setString(2, dptob.getDescription());
            statement.setInt(3, id);      
            int rowsUpdated = statement.executeUpdate();  
            return rowsUpdated > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false; 
        }
    }

    @Override
    public boolean deleteDPT(int id) {
        String query = "DELETE FROM department WHERE id = ?";
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
    public List<Department> retrieveAllDepartments() {
        List<Department> departments = new ArrayList<>();
        String query = "SELECT * FROM department";

        try (Connection connection = (Connection) Database.connect()) {
            statement = (PreparedStatement) connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                // Retrieve department information from the result set
                int id = resultSet.getInt("id");
                String dcode = resultSet.getString("DCode");
                String name = resultSet.getString("name");
                String description = resultSet.getString("Description");

                // Create a new Department object
                Department department = new Department(id, dcode, name, description);

                // Add the department to the list
                departments.add(department);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return departments;
    }

    @Override
    public List<Department> dataToCombo() {
        List<Department> departments = new ArrayList<>();
        String query = "SELECT * FROM department";
        
        try (Connection connection = (Connection) Database.connect()) {
            statement = (PreparedStatement) connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                
                Department department = new Department(id, name);
                departments.add(department);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return departments;
    }

}
