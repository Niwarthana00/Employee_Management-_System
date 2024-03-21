/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assingment.backend.interfaces;

import assingment.backend.model.HR_Manager;
import java.util.List;

/**
 *
 * @author MSI
 */
public interface Hr_Manager_interface {
    boolean createUser(HR_Manager hr_manager);
    void readUser(int userId);
    boolean updateUser(int userId, HR_Manager hr_manager);
    boolean deleteUser(int userId , String email);
    List<HR_Manager> retrieveAllHRMANAGER();
}
