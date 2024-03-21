/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assingment.backend.services;

import assingment.backend.model.LocalStorage;

/**
 *
 * @author User
 */
public class User1 {
     public static void main(String[] args) {
        
        LocalStorage storage = new LocalStorage();
        String username = storage.getData("username");
        System.out.println("Username: " + username);
     }
}
