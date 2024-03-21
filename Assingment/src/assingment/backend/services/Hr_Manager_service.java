/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package assingment.backend.services;

import assingment.backend.database.Database;
import assingment.backend.interfaces.Hr_Manager_interface;
import assingment.backend.model.HR_Manager;
import assingment.backend.model.User;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Hr_Manager_service implements Hr_Manager_interface{

    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    User_service user_service_ob = null;
    
    @Override
    public boolean createUser(HR_Manager hr_manager) {  
        try {
            
            User user_ob = new User(hr_manager.getId(),hr_manager.getEmail(),hr_manager.getPassword(),hr_manager.getUserType(),hr_manager.getTelephoneNumber(),hr_manager.getTimestamp());
            User_service user_service_ob = new User_service();
            user_service_ob.createUser(user_ob);
            
            connection = (Connection) Database.connect();
            String query = "INSERT INTO hr_manager (name, address, nic, bod, education_qualification , email) VALUES (?, ?, ?, ?, ? , ?)";
            statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setString(1, hr_manager.getName());
            statement.setString(2, hr_manager.getAddress());
            statement.setString(3, hr_manager.getNic());
            statement.setString(4, hr_manager.getBod());
            statement.setString(5, hr_manager.getEducation_qualification());
            statement.setString(6, hr_manager.getEmail());
            
            int rowsAffected = statement.executeUpdate();
            if (rowsAffected > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
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
    public boolean updateUser(int userId, HR_Manager hr_manager) {
        
        String query = "UPDATE hr_manager SET name = ?, address = ?, education_qualification = ? WHERE id = ?";
        try (Connection connection = (Connection) Database.connect()) {
            statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setString(1, hr_manager.getName());
            statement.setString(2, hr_manager.getAddress());
            statement.setString(3, hr_manager.getEducation_qualification());
            statement.setInt(4, userId);

            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean deleteUser(int userId , String email) {
        User_service user_service_ob = new User_service();
        user_service_ob.deleteUser(email);
        
        String query = "DELETE FROM hr_manager WHERE id = ?";
        try (Connection connection = (Connection) Database.connect()) {
            statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setInt(1, userId);
            statement.executeUpdate();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; 
    }

    @Override
    public List<HR_Manager> retrieveAllHRMANAGER() {
        List<HR_Manager> hrManagers = new ArrayList<>();
        String query = "SELECT * FROM user u, hr_manager m WHERE u.email = m.email and u.user_type = \"HR Manager\"";

        try (Connection connection = (Connection) Database.connect()) {
            statement = (PreparedStatement) connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int userId = resultSet.getInt("u.id");
                String email = resultSet.getString("u.email");
                String password = resultSet.getString("u.password");
                String userType = resultSet.getString("u.user_type");
                String telephoneNumber = resultSet.getString("u.telephone_number");
                java.sql.Timestamp userTimestamp = resultSet.getTimestamp("u.timestamp");

                int hrId = resultSet.getInt("m.id");
                String name = resultSet.getString("m.name");
                String address = resultSet.getString("m.address");
                String nic = resultSet.getString("m.nic");
                Date bod = resultSet.getDate("m.bod");
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                String bodString = sdf.format(bod);
                  
                String educationQualification = resultSet.getString("m.education_qualification");
                java.sql.Timestamp hrTimestamp = resultSet.getTimestamp("m.timestamp");
                Date date = new Date(hrTimestamp.getTime());
                String hrTimestampString = sdf.format(date);

                // Create HRManager object
                HR_Manager hrManager = new HR_Manager(name, address,  nic,  bodString,  educationQualification,  hrId,  email,  password,  userType,  telephoneNumber,  hrTimestampString);
                hrManagers.add(hrManager);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hrManagers;
    }

}
