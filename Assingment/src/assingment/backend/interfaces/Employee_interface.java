/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assingment.backend.interfaces;

import assingment.backend.model.Designation;
import assingment.backend.model.Employee;
import java.util.List;


public interface Employee_interface {
    boolean createEMP(Employee empob);
    boolean updateEMP(int id ,Employee empob);
    boolean deleteEMP(Employee empob);   
    List<Employee> retrieveAllEMP();
    List<Employee> searchEMP(String name, String epf_num, String dpt , String designation);
    
}
