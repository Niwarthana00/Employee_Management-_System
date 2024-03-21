/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assingment.backend.services;

import assingment.backend.database.Database;
import assingment.backend.interfaces.Admin_interface;
import assingment.backend.model.Admin;
import assingment.backend.model.User;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin_service implements Admin_interface{
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    User_service user_service_ob = null;
    
    @Override
    public boolean createUser(Admin admin_ob) {
        try {
                User user_ob = new User(admin_ob.getId(),admin_ob.getEmail(),admin_ob.getPassword(),admin_ob.getUserType(),admin_ob.getTelephoneNumber(),admin_ob.getTimestamp());
                User_service user_service_ob = new User_service();
                user_service_ob.createUser(user_ob);
                connection = (Connection) Database.connect();
                String query = "INSERT INTO Admin (name , email) VALUES (? , ?)";
               
                statement = (PreparedStatement) connection.prepareStatement(query);
                statement.setString(1, admin_ob.getName());
                statement.setString(2, admin_ob.getEmail());
                
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
    
}
