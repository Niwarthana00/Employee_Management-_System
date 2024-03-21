package assingment.backend.services;

import assingment.backend.interfaces.Validation;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */

public class Validation_service implements Validation {

    @Override
    public boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return Pattern.compile(emailRegex).matcher(email).matches();
    }

    @Override
    public boolean isValidPhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\d{10}");
    }

    @Override
    public boolean isValidNIC(String nic) {
        boolean old_nic =  nic.matches("\\d{9}[Vv]");
        if(old_nic){
            return true;
        }else{
            return validateNICNew(nic);
        }
    }
    
    public boolean validateNICNew(String nic) {
        int length = nic.length();
        if (length != 12) {
            return false;
        } else {
            
            if (!nic.trim().matches("/[0-9]{12}/")) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public boolean lengthValidate(String parameter, int length) {
        return parameter.length() == length;
    }
    
    
 
//    public boolean isValidDate(String date) {
//        DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        sdf.setLenient(false);
//
//        try {
//            sdf.parse(date);
//            return true;
//        } catch (ParseException e) {
//            return false;
//        }
//    
//    }

    @Override
    public boolean isValidBirthday(String birthday) {
        String regex = "\\d{4}-\\d{2}-\\d{2}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(birthday);
        return matcher.matches();
    }
} 
