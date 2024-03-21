/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assingment.backend.interfaces;

import assingment.backend.model.HR_Assistant;


public interface Hr_Assistant_interface {
   
    boolean createUser(HR_Assistant hr_Assis);
    void readUser(int userId);
    boolean updateUser(int userId, HR_Assistant hr_Assis);
    boolean deleteUser(int userId ,  String email);  
}
