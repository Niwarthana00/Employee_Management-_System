/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package assingment.backend.services;

import assingment.backend.model.LocalStorage;
import assingment.backend.model.Admin;
import assingment.backend.model.HR_Assistant;
import assingment.backend.model.HR_Manager;
import java.io.File;
import java.io.IOException;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType0Font;

public class Test {

//     public static void main(String [] args){  
//      String to = "sathyanjali00@gmail.com";//change accordingly  
//      String from = "nadun2952@gmail.com";
//      String host = "localhost";
//  
//     //Get the session object  
//      Properties properties = System.getProperties();  
//      properties.setProperty("mail.smtp.host", "25");  
//      Session session = Session.getDefaultInstance(properties);  
//  
//     //compose the message  
//      try{  
//         MimeMessage message = new MimeMessage(session);  
//         message.setFrom(new InternetAddress(from));  
//         message.addRecipient(Message.RecipientType.TO,new InternetAddress(to));  
//         message.setSubject("Ping");  
//         message.setText("Hello, this is example of sending email  ");  
//  
//         // Send message  
//         Transport.send(message);  
//         System.out.println("message sent successfully....");  
//  
//      }catch (MessagingException mex) {mex.printStackTrace();}  
//   }  
    
    public static void main(String[] args) {
         // Example usage
        LocalStorage storage = new LocalStorage();
        storage.saveData("username", "exampleUser");
        String username = storage.getData("username");
        System.out.println("Username: " + username);
    }
}



