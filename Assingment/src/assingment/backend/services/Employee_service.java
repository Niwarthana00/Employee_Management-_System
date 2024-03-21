/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assingment.backend.services;

import assingment.backend.database.Database;
import assingment.backend.interfaces.Employee_interface;
import assingment.backend.model.Employee;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Employee_service implements Employee_interface {
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;

    @Override
    public boolean createEMP(Employee empob) {
        try {
            connection = (Connection) Database.connect();
            String query = "INSERT INTO employee (epf_num, name, department, designation, bod, phoneNumber, email, salary, employmentStatus, qualifications, experience , nic) " +
                       "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? , ?)";          
            statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setString(1, empob.getEpf_num());
            statement.setString(2, empob.getName());
            statement.setString(3, empob.getDepartment());
            statement.setString(4, empob.getDesignation());
            statement.setString(5, empob.getBod());
            statement.setString(6, empob.getPhoneNumber());
            statement.setString(7, empob.getEmail());
            statement.setString(8, empob.getSalary());
            statement.setString(9, empob.getEmploymentStatus());
            statement.setString(10, empob.getQualifications());
            statement.setString(11, empob.getExperience());
            statement.setString(12, empob.getNic());
            
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
    public boolean deleteEMP(Employee empob) {
        String query = "DELETE FROM employee WHERE id = ?";
        try{
             connection = (Connection) Database.connect();
             statement = (PreparedStatement) connection.prepareStatement(query);
             statement.setInt(1, empob.getId());
             int rowsAffected = statement.executeUpdate();
             return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Employee> retrieveAllEMP() {
        List<Employee> empList = new ArrayList<>();
        String query = "SELECT * FROM employee";
        
        try {
            connection = (Connection) Database.connect();
            statement = (PreparedStatement) connection.prepareStatement(query);
            resultSet = (ResultSet) statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String epfNum = resultSet.getString("epf_num");
                String name = resultSet.getString("name");
                String department = resultSet.getString("department");
                String designation = resultSet.getString("designation");
                String bod = resultSet.getString("bod");
                String phoneNumber = resultSet.getString("phoneNumber");
                String email = resultSet.getString("email");
                String salary = String.valueOf(resultSet.getDouble("salary"));
                String employmentStatus = resultSet.getString("employmentStatus");
                String qualifications = resultSet.getString("qualifications");
                String experience = resultSet.getString("experience");
                String nic = resultSet.getString("nic");
                
                // Create Employee object and add to the list
                Employee employee = new Employee(id, epfNum, name, department, designation, bod, phoneNumber, email, salary, employmentStatus, qualifications, experience,nic);
                empList.add(employee);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return empList;
    }

    @Override
    public List<Employee> searchEMP(String name, String epf_num, String dpt, String designation) {
        List<Employee> empList = new ArrayList<>();
        String query = "SELECT * FROM employee WHERE 1=1";
        Employee employee = null;
        
        if (!"null".equals(name)) {
            query += " AND name LIKE ?";
        }
        if (!"null".equals(epf_num)) {
            query += " AND epf_num = ?";
        }
        if (!"null".equals(dpt)) {
            query += " AND department LIKE ?";
        }
        if (!"null".equals(designation)) {
            query += " AND designation LIKE ?";
        }
        
         try {
            connection = (Connection) Database.connect();
            statement = (PreparedStatement) connection.prepareStatement(query);
            
            int parameterIndex = 1;
            if (!"null".equals(name)) {
                statement.setString(parameterIndex++, "%" + name + "%");
            }
            if (!"null".equals(epf_num)) {
                statement.setString(parameterIndex++, epf_num);
            }
            if (!"null".equals(dpt)) {
                statement.setString(parameterIndex++, "%" + dpt + "%");
            }
            if (!"null".equals(designation)) {
                statement.setString(parameterIndex++, "%" + designation + "%");
            }
            
            resultSet = (ResultSet) statement.executeQuery();
            while (resultSet.next()) {
                // Retrieve employee information from the result set
                 int id = resultSet.getInt("id");
                 String epfNum = resultSet.getString("epf_num");
                 String name_emp = resultSet.getString("name");
                 String department = resultSet.getString("department");
                 String designation_emp = resultSet.getString("designation");
                 String bod = resultSet.getString("bod");
                 String phoneNumber = resultSet.getString("phoneNumber");
                 String email = resultSet.getString("email");
                 String salary = String.valueOf(resultSet.getDouble("salary"));
                 String employmentStatus = resultSet.getString("employmentStatus");
                 String qualifications = resultSet.getString("qualifications");
                 String experience = resultSet.getString("experience");
                 String nic = resultSet.getString("nic");

                employee = new Employee(id, epfNum, name_emp, department, designation_emp, bod, phoneNumber, email, salary, employmentStatus, qualifications, experience,nic);
                empList.add(employee);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return empList;
    }

    @Override
    public boolean updateEMP(int id , Employee empob) {
         String query = "UPDATE employee SET name = ?, department = ?, designation = ?, bod = ?, phoneNumber = ?, salary = ?, employmentStatus = ?, qualifications = ?, experience = ? WHERE id = ?";
 
         try{
                connection = (Connection) Database.connect();
                statement = (PreparedStatement) connection.prepareStatement(query);
                
                statement.setString(1, empob.getName());
                statement.setString(2, empob.getDepartment());
                statement.setString(3, empob.getDesignation());
                statement.setString(4, empob.getBod());
                statement.setString(5, empob.getPhoneNumber());
                double salary = Double.parseDouble(empob.getSalary());
                statement.setDouble(6, salary);
                statement.setString(7, empob.getEmploymentStatus());
                statement.setString(8, empob.getQualifications());
                statement.setString(9, empob.getExperience());
                statement.setInt(10, id);

                int rowsUpdated = statement.executeUpdate();

                return rowsUpdated > 0;

            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }
        }   
}
