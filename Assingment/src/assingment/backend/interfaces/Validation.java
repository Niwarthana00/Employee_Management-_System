/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package assingment.backend.interfaces;

/**
 *
 * @author User
 */
public interface Validation {
    boolean isValidEmail(String email);
    boolean isValidPhoneNumber(String phoneNumber);
    boolean isValidNIC(String nic);
    boolean lengthValidate(String parameter , int length);
    boolean isValidBirthday(String birthday);
    
}
