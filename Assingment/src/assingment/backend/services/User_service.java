/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package assingment.backend.services;

import assingment.backend.database.Database;
import assingment.backend.interfaces.User_iterface;
import assingment.backend.model.PasswordUtils;
import assingment.backend.model.User;
import com.mysql.jdbc.Connection;
import java.sql.ResultSet;
import com.mysql.jdbc.PreparedStatement;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
/**
 *
 * @author MSI
 */
public class User_service implements User_iterface{
    
    Connection connection = null;
    PreparedStatement statement = null;
    ResultSet resultSet = null;
    User user = null;
   
    @Override
    public boolean createUser(User user_ob) {
        try {
            connection = (Connection) Database.connect();
            String query = "INSERT INTO user (email, password, user_type, telephone_number) VALUES (?, ?, ?, ?)";
            statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setString(1, user_ob.getEmail());
            
            String hashedPassword = PasswordUtils.hashPassword(user_ob.getPassword());

            statement.setString(2, hashedPassword);
            statement.setString(3, user_ob.getUserType());
            statement.setString(4, user_ob.getTelephoneNumber());
            
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
        return true;
    }

    @Override
    public void deleteUser(String email) {
        String query = "DELETE FROM user WHERE email  = ?";
        try {
            connection = (Connection) Database.connect();
            statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setString(1, email); 
            statement.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String loginFunction(String email, String password) {
        String query = "SELECT * FROM user WHERE email = ? ";
        try {
            connection = (Connection) Database.connect();
            statement = (PreparedStatement) connection.prepareStatement(query);
            statement.setString(1, email);
            
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    String storedPassword = resultSet.getString("password"); 
                    String hashedInputPassword = PasswordUtils.hashPassword(password);
                    
                    if(storedPassword.equals(hashedInputPassword)){
                        return resultSet.getString("user_type");
                    }else{
                        return resultSet.getString("user_type");
                    }
                    
                }
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "false";
    }

    @Override
    public String password_generate() {
        String uppercaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*_";
        String allCharacters = uppercaseLetters + lowercaseLetters + numbers + specialCharacters;
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int randomIndex = random.nextInt(allCharacters.length());
            password.append(allCharacters.charAt(randomIndex));
        }
        return password.toString();
    }
    
    

    @Override
    public void download_password(String password, String name) {
        int width = 500;
        int height = 100;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g = image.createGraphics();

        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);

        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.BLACK);
        
        int padding = 10;
        int textHeight = g.getFontMetrics().getHeight();
        g.drawString("User name: " + name, padding, padding + textHeight);
        g.drawString("Password: " + password, padding, 2 * padding + 2 * textHeight);

        g.dispose();

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        FileNameExtensionFilter filter = new FileNameExtensionFilter("JPEG files", "jpg", "jpeg");
        fileChooser.setFileFilter(filter);

        fileChooser.setSelectedFile(new File(name + " - password.jpg"));
        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();

            try {
                ImageIO.write(image, "jpg", fileToSave);
                System.out.println("Password saved as " + fileToSave.getAbsolutePath());
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
