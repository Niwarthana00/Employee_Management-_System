/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assingment.backend.services;

import assingment.backend.database.Database;
import assingment.backend.interfaces.Hr_Assistant_interface;
import assingment.backend.model.HR_Assistant;
import assingment.backend.model.User;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MSI
 */
public class Hr_Assistant_Service implements Hr_Assistant_interface {
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    User_service user_service_ob = null;
    
    @Override
    public boolean createUser(HR_Assistant hr_Assis) {
        try {
            
            User user_ob = new User(hr_Assis.getId(),hr_Assis.getEmail(),hr_Assis.getPassword(),hr_Assis.getUserType(),hr_Assis.getTelephoneNumber(),hr_Assis.getTimestamp());
            user_service_ob = new User_service();
            user_service_ob.createUser(user_ob);
            connection = (Connection) Database.connect();
            String query = "INSERT INTO hr_assistant (name, address, designation, nic, bod, email , working_experince, education_qualification) VALUES (?,?, ?, ?, ?, ?, ?, ?)";
            
            statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setString(1, hr_Assis.getName());
            statement.setString(2, hr_Assis.getAddress());
            statement.setString(3, hr_Assis.getDesignation());
            statement.setString(4, hr_Assis.getNic());
            
            String dateString = hr_Assis.getBod(); 
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date utilDate = dateFormat.parse(dateString);
            java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
            statement.setDate(5, sqlDate);
            
            statement.setString(6, hr_Assis.getEmail());
            statement.setInt(7, hr_Assis.getWorking_experince());
            statement.setString(8, hr_Assis.getEducation_qualification());
            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        
       } catch (SQLException e) {
            e.printStackTrace();
        } catch (ParseException ex) {
            Logger.getLogger(Hr_Assistant_Service.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            // Close resources
            try {
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
        
        
    }

    @Override
    public void readUser(int userId) {
        
        
        
        
        
        
    }

    @Override
    public boolean updateUser(int userId, HR_Assistant hr_Assis) {
         String query = "UPDATE hr_assistant SET name = ? , address = ? , designation =? , working_experince =? , education_qualification =? WHERE id = ?";
        try  {
            connection = (Connection) Database.connect();
            statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setString(1, hr_Assis.getName());
            statement.setString(2, hr_Assis.getAddress());   
            statement.setString(3, hr_Assis.getDesignation());
            statement.setInt(4, hr_Assis.getWorking_experince()); 
            statement.setString(5, hr_Assis.getEducation_qualification());
            statement.setInt(6, userId);  
            int rowsUpdated = statement.executeUpdate();  
            return rowsUpdated > 0;
            
        } catch (SQLException e) {
            e.printStackTrace();
            return false; 
        } 
    }

    @Override
    public boolean deleteUser(int userId , String email) {
        User_service user_service_ob = new User_service();
        user_service_ob.deleteUser(email);
        
        String query = "DELETE FROM hr_assistant WHERE id = ?";
        try{
             connection = (Connection) Database.connect();
             statement = (PreparedStatement) connection.prepareStatement(query);
             statement.setInt(1, userId);
             int rowsAffected = statement.executeUpdate();
             return rowsAffected > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

  public List<HR_Assistant> retrieveAllUsers() {
        List<HR_Assistant> userList = new ArrayList<>();
       

        try {
            connection = (Connection) Database.connect();
            String query = "SELECT hr.*, u.* FROM hr_assistant hr INNER JOIN user u ON hr.email = u.email";
            statement = (PreparedStatement) connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {
                HR_Assistant hrAssistant = new HR_Assistant();
                hrAssistant.setId(resultSet.getInt("id"));
                hrAssistant.setName(resultSet.getString("name"));
                hrAssistant.setAddress(resultSet.getString("address"));
                hrAssistant.setDesignation(resultSet.getString("designation"));
                hrAssistant.setNic(resultSet.getString("nic"));
                hrAssistant.setBod(resultSet.getString("bod"));
                hrAssistant.setEmail(resultSet.getString("email"));
                hrAssistant.setWorking_experince(resultSet.getInt("working_experince"));
                hrAssistant.setEducation_qualification(resultSet.getString("education_qualification"));
                hrAssistant.setTelephoneNumber(resultSet.getString("telephone_number"));
                userList.add(hrAssistant);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return userList;
    }
}
